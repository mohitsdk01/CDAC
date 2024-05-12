package cdac.java.q5.tester;

import static cdac.java.q5.utils.DummyDataUtils.populateAdminmap;
import static cdac.java.q5.utils.DummyDataUtils.populateCustMap;
import static cdac.java.q5.utils.ShopUtils.adminAccessFunctionality;
import static cdac.java.q5.utils.ShopUtils.customerAccessFunctionality;
import static cdac.java.q5.utils.DummyDataUtils.populatePet;
import static cdac.java.q5.utils.DummyDataUtils.populateOrder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.security.sasl.AuthenticationException;

import cdac.java.q5.core.Order;
import cdac.java.q5.core.Pet;
import cdac.java.q5.users.Admin;
import cdac.java.q5.users.Customer;

public class ShopTester {

	public static void main(String[] args) {
		System.out.println("WELCOME TO THE PET SHOP");
		
		try(Scanner sc = new Scanner(System.in)){
			Map<String, String> adminMap = populateAdminmap();
			Map<String, String> custMap = populateCustMap();
			Map<Integer, Pet> petMap = populatePet();
			Map<Integer, Order> orderMap = populateOrder();
			
			boolean exit = false;
			int choice;
			
			do {
				System.out.println("Menu: \n");
				System.out.println("1. Add Admin\n"
						+ "2. Add Customer\n"
						+ "3. Admin Login\n"
						+ "4. Customer Login\n"
						+ "5. Display All Pets\n");
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						System.out.println("Enter Admin UID: ");
						String userEnterdAdminUID = sc.next();
						System.out.println("Enter Admin UID Password: ");
						String userEnterdAdminUIDPass = sc.next();
						if(userEnterdAdminUID.equals(Admin.adminUId) 
								&& userEnterdAdminUIDPass.equals(Admin.adminPass)) {
							System.out.println("Enter User Id and Password to be Set: ");
							Admin admin = new Admin(sc.next(), sc.next());
							adminMap.put(admin.getAdminLoginId(), admin.getAdminPwd());
							System.out.println("Admin Added");
						}
						break;
						
					case 2:
						System.out.println("Enter User Id and Password to be Set: ");
						Customer customer = new Customer(sc.next(), sc.next());
						custMap.put(customer.getCustomerId(), customer.getCustomerPwd());
						System.out.println("Customer Added");
						break;

					case 3:
						System.out.println("Enter Admin ID: ");
						String adminId = sc.next();
						System.out.println("Enter Admin Password: ");
						String adminPass = sc.next();
						
						if(adminMap.containsKey(adminId) && adminMap.containsValue(adminPass)) {
							System.out.println("Login Successful...");
						}
//						else
//							throw new AuthenticationException("Invalid Admin Credentials!!");
						adminAccessFunctionality(petMap, orderMap, sc);
						break;
						
					case 4:
						System.out.println("Enter Customer ID: ");
						String custId = sc.next();
						System.out.println("Enter Admin Password: ");
						String custPass = sc.next();
						
						if(custMap.containsKey(custId) && custMap.containsValue(custPass)) {
							System.out.println("Login Successful...");
							customerAccessFunctionality(petMap, orderMap, sc);
						}
						else
							throw new AuthenticationException("Invalid Customer Credentials!!");
						break;
					
					case 5:
						for(Pet p : petMap.values())
							System.out.println(p);
						break;
						
					case 0:
						exit = true;
						break;
					}
				}catch (Exception e) {
					sc.nextLine();
					e.printStackTrace();
				}
				
			}while(!exit);
		}
	}

}
