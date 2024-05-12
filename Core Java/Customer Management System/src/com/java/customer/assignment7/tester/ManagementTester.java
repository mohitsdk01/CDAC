package com.java.customer.assignment7.tester;

import static com.java.customer.assignment7.utils.CustomerUtils.populateList;
import static com.java.customer.assignment7.utils.CustomerValidations.validationNewPass;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.java.customer.assignment7.customer.Customer;
import com.java.customer.assignment7.ordering.CustomerAccountAscIdComparator;
import com.java.customer.assignment7.utils.CustomerUtils;
import com.java.customer.assignment7.utils.CustomerValidations;

public class ManagementTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("WELCOME TO CUSTOMER "
					+ "MANAGEMENT SYSTEM");
			List<Customer> customerList = populateList();
			boolean exit = false;
			int choice;
			do {
				System.out.println("Menu: \n");
				System.out.println("1. Sign up (First Name, Last Name, E-Mail, "
						+ "Password, RegistrationAmount, DOB, "
						+ "Plans[SILVER, GOLD, DIAMOND, PLATINUM)\n"
						+ "2. Sign In (login)\n"
						+ "3. Change Password\n"
						+ "4. Un-subscribe Customer\n"
						+ "5. Display All Customers.\n"
						+ "6. Display All Customers by Customer ID (ASC).\n"
						+ "7. Display All Customers by E-Mail (ASC).\n"
						+ "8. Display All Customers by DOB (ASC).\n"
						+ "9. Write Customer Details into Text File.\n"
						+ "0. Exit\n");
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						System.out.println("Enter Customer Details: ");
						Customer cust = CustomerValidations.validateInput
								(sc.next(), sc.next(), sc.next(), sc.next(), 
										sc.nextDouble(), sc.next(), sc.next(), customerList);
						customerList.add(cust);
						System.out.println("***Booom!!! Your Registered...");
						break;
					case 2:
						System.out.println("Enter Email:\n");
						Customer emailCust = new Customer(sc.next());
//						int index = customerList.indexOf(emailCust);
//						if(index == -1) {
//							throw new CustomerManagementException("Invalid Email!!!");
//						}
						int index = CustomerUtils.emailValidationInList(customerList, emailCust);
						
						System.out.println("Enter Password: ");
						String userEnteredPass = sc.next();
						String pass = customerList.get(index).getPassword();
						
						CustomerUtils.passwordValidator(userEnteredPass, pass);
						break;
						
					case 3:
						System.out.println("Enter Registered Email: ");
						Customer emailCust1 = new Customer(sc.next());
						int index1 = CustomerUtils.emailValidationInList(customerList, emailCust1);
						System.out.println("Enter Password: ");
						String userEnteredOldPassword = sc.next();
						String oldPass = customerList.get(index1).getPassword();
						
						CustomerUtils.passwordValidator(userEnteredOldPassword, oldPass);
						
						System.out.println("Enter New Password: ");
						String newPass = sc.next();
						validationNewPass(newPass);
						customerList.get(index1).setPassword(newPass);
						System.out.println("Password Updated Successfully...");
						break;
						
					case 4:
						System.out.println("Enter Registered Email: ");
						Customer emailCustomerDelete = new Customer(sc.next());
						int index2 = CustomerUtils.emailValidationInList(customerList, emailCustomerDelete);
						customerList.remove(index2);
						System.out.println("We have regrets to loose you...");
						break;
						
					case 5:
						System.out.println("Details: ");
						for(Customer c : customerList) {
							System.out.println(c);
						}
						break;
					
					case 6:
						System.out.println("Sort The Customers in ASC manner: (ID)");
						Collections.sort(customerList, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								if(o1.getId() < o2.getId()) return -1;
								else if(o1.getId() == o2.getId()) return 0; 
								else return 1;
							}
						});
						
//						Collections.sort(customerList, new CustomerAccountAscIdComparator());
						for(Customer c : customerList) {
							System.out.println(c);
						}
						break;
						
					case 7:
						System.out.println("Display All Customers by Customer E-Mail (ASC)");
						Collections.sort(customerList, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								int comRes = o1.getEmail().compareTo(o2.getEmail());
								return comRes;
							}
						});
						
						for(Customer c : customerList) {
							System.out.println(c);
						}
						break;
						
					case 8:
						System.out.println("Display All Customers by Customer DOB (ASC)");
						Collections.sort(customerList, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								int comRes = o1.getDob().compareTo(o2.getDob());
								return comRes;
							}
						});
						
						for(Customer c : customerList) {
							System.out.println(c);
						}
						break;
						
					case 9:
						System.out.println("Enter File Name: ");
//						ObjectOutputStream oos = 
//								new ObjectOutputStream(
//										new FileOutputStream(sc.next()));
						String fileName = sc.next();
						//BufferedWriter OR PrintWriter(pw.println(c);)
						BufferedWriter pw = new BufferedWriter(new FileWriter(fileName));
						for(Customer c : customerList)
							pw.write(c.toString());
						pw.close();
						System.out.println("Data Successfully Written in file...");
						break;
						
					case 0:
						exit = true;
						break;
						
					}
				}catch (Exception e) {
					e.printStackTrace();
					}
			}while(!exit);

		}
	}
}
