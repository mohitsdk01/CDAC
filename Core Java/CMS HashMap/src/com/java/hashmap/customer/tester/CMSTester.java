package com.java.hashmap.customer.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.java.hashmap.customer.*;
import com.java.hashmap.customer.exceptions.CustomerManagementException;
//import com.java.hashmap.customer.utils.CustomerEmailComparator;
import com.java.hashmap.customer.utils.CustomerValidations;

import static com.java.hashmap.customer.utils.CustomerUtils.populateMap;

public class CMSTester {

	public static void main(String[] args) {
		System.out.println("WELCOME TO CUSTOMER MANAGEMENT SYSTEM");
		
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Customer> customerList = populateMap();
			
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
						+ "6. Display All Customers Sorted By Email-ID.\n"
						+ "7. Display All Customers Sorted By CustomerID.\n"
						+ "8. Display All Customers Sorted By DOB.\n"
						+ "0. Exit\n");
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						System.out.println("Enter Customer Details: ");
						Customer customer = CustomerValidations.inputvalidator
								(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
										sc.next(), sc.next(), customerList);
						customerList.put(customer.getEmail(), customer);
						System.out.println("Hey!" + customer.getFirstName() 
						+ " Your Registered Successfully...");
						
						break;
						
					case 2:
						System.out.println("Enter Email:\n");
						String enterdEmail = sc.next();
						System.out.println("Enter Password: \n");
						String enterdPass = sc.next();
						if(!customerList.containsKey(enterdEmail)) {
							throw new CustomerManagementException(enterdEmail + " is  Invalid!!!");
						}
						for(Customer c : customerList.values())
							if(!c.getPassword().equals(enterdPass)) {
								throw new CustomerManagementException("Password is Invalid!!!");
							}
						System.out.println("Login Successful...");
						break;
						
					case 3:
						System.out.println("Enter Registered Email: ");
						String enterdEmail1 = sc.next();
						if(!customerList.containsKey(enterdEmail1)) {
							throw new CustomerManagementException
								(enterdEmail1 + " is Invalid, Not found in DB!!!");
						}
						System.out.println("Enter Old Password: ");
						String oldPass = sc.next();
						boolean isOldPassValid = false;
						for(Customer c : customerList.values()) {
							isOldPassValid = c.getPassword().equals(oldPass);
							if(isOldPassValid) {
								System.out.print("IN Pass");
								System.out.println("Enter New Password");
								String newPass = sc.next();
								c.setPassword(newPass);
							}	
						}
						if(!isOldPassValid) {
							throw new CustomerManagementException
							("Password is Invalid, Not found in DB!!!");
						}
						System.out.println("Password Updated Successfully...");
						break;
						
					case 4:
						System.out.println("Enter Registered Email: ");
						String regEmail = sc.next();
						if(customerList.containsKey(regEmail)) {
							System.out.println("Do you Really Want to Delete Your Account? Y/N");
							char ch = sc.next().charAt(0);
							if(ch == 'Y' || ch == 'y')
								customerList.remove(regEmail);
						}
						System.out.println("Account Deleted Successfully!!!");
						break;
					case 5:
						System.out.println("Details: ");
						for(Customer c : customerList.values()) {
							System.out.println(c);
						}
						break;
					case 6:
						System.out.println("Sort The Customers in ASC manner: (Email(ID))"); 
						ArrayList<Customer> list = new ArrayList<>(customerList.values());
						Collections.sort(list, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								return o1.getEmail().compareTo(o2.getEmail());
							}
						});
						
						for(Customer c : list)
							System.out.println(c);
						break;
					case 7:
						System.out.println("Sort The Customers in ASC manner: (ID)"); 
						ArrayList<Customer> list1 = new ArrayList<>(customerList.values());
						Collections.sort(list1, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								if(o1.getId() < o2.getId()) return -1;
								else if(o1.getId() == o2.getId()) return 0;
								else return 1;
							}
						});
						
						for(Customer c : list1)
							System.out.println(c);
						break;
					case 8:
						System.out.println("Sort The Customers in ASC manner: DOB"); 
						ArrayList<Customer> list2 = new ArrayList<>(customerList.values());
						Collections.sort(list2, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								return o1.getDob().compareTo(o2.getDob());
							}
						});
						
						for(Customer c : list2)
							System.out.println(c);
						break;
						
					case 0:
						exit = true;
						break;
						
					}
				}catch(Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
				
			}while(!exit);
		}

	}

}
