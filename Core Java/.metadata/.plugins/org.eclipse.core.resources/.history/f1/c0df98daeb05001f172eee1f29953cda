package cdac.b1.tester;

import static cdac.b1.utils.Utility.populateContactMap;
import static cdac.b1.utils.Utility.addContactDetails;
import static cdac.b1.utils.Utility.displayAllContacts;
import static cdac.b1.utils.Utility.updateContactDetails;
import static cdac.b1.utils.Utility.removeAllContactsAbove80yrs;

import java.util.Map;
import java.util.Scanner;

import cdac.b1.core.Contact;

public class PhoneBookTester {

	public static void main(String[] args) {
		System.out.println("Welocome to PhoneBook");
		
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Contact> contactMap = populateContactMap();
			boolean exit = false;
			int choice;
			
			do {
				System.out.println("Menu: \n");
				System.out.println("1. Add New Contact."
						+ "[Phone Number, Name, DOB, Email(Optional)] \n"
						+ "2. Display All Contacts. \n"
						+ "3. Update Contact Details.\n"
						+ "4. Remove all contacts above 80years.\n"
						+ "5. Exit");
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						addContactDetails(contactMap, sc);
						break;
					
					case 2:
						displayAllContacts(contactMap, sc);
						break;
					
					case 3:
						updateContactDetails(contactMap, sc);
						break;
					
					case 4:
						removeAllContactsAbove80yrs(contactMap, sc);
						break;
						
					case 5:
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
