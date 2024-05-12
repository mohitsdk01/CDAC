package com.java.customer.assignment7.tester;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.java.customer.assignment7.customer.Customer;
import com.java.customer.assignment7.utils.CustomerUtils;
import com.java.customer.assignment7.utils.CustomerValidations;
import static com.java.customer.assignment7.utils.CustomerValidations.validationNewPass;
import static com.java.customer.assignment7.utils.CustomerUtils.populateList;

public class ManagementTester {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("WELCOME TO CUSTOMER "
					+ "MANAGEMENT SYSTEM");
			Map<String, Customer> customerList = populateList();
			boolean exit = false;
			int choice;
			int counter = 100;
			do {
				System.out.println("Menu: \n");
				System.out.println("1. Sign up (First Name, Last Name, E-Mail, "
						+ "Password, RegistrationAmount, DOB, "
						+ "Plans[SILVER, GOLD, DIAMOND, PLATINUM)\n"
						+ "2. Sign In (login)\n"
						+ "3. Change Password\n"
						+ "4. Un-subscribe Customer\n"
						+ "5. Display All Customers.\n"
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
						customerList.put(cust.getEmail(), cust);
						System.out.println("***Booom!!! Your Registered...");
						break;
					case 2:
						System.out.println("Enter Email:\n");
						Customer emailCust = new Customer(sc.next());
//						int index = customerList.indexOf(emailCust);
//						if(index == -1) {
//							throw new CustomerManagementException("Invalid Email!!!");
//						}
						int index = CustomerUtils.emailValidator(customerList, emailCust);
						
						System.out.println("Enter Password: ");
						String userEnteredPass = sc.next();
						String pass = customerList.get(index).getPassword();
						
						CustomerUtils.passwordValidator(userEnteredPass, pass);
						break;
						
					case 3:
						System.out.println("Enter Registered Email: ");
						Customer emailCust1 = new Customer(sc.next());
						int index1 = CustomerUtils.emailValidator(customerList, emailCust1);
						System.out.println("Enter Password: ");
						String userEnteredPass1 = sc.next();
						String pass1 = customerList.get(index1).getPassword();
						
						CustomerUtils.passwordValidator(userEnteredPass1, pass1);
						
						System.out.println("Enter New Password: ");
						String newPass = sc.next();
						validationNewPass(newPass);
						customerList.get(index1).setPassword(newPass);
						System.out.println("Password Updated Successfully...");
						break;
						
					case 4:
						System.out.println("Enter Registered Email: ");
						Customer emailCustomerDelete = new Customer(sc.next());
						int index2 = CustomerUtils.emailValidator(customerList, emailCustomerDelete);
						customerList.remove(index2);
						System.out.println("We have regrets to loose you...");
						break;
					case 5:
						System.out.println("Details: ");
						for(Customer c : customerList.values()) {
							System.out.println(c);
						}
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
