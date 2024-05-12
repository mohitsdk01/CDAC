package cdac.b1.utils;

import static cdac.b1.utils.ContactValidations.inputValidation;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cdac.b1.core.Contact;
import cdac.b1.exceptions.ContactBookException;

public class Utility {
	
	public static Map<String, Contact> populateContactMap(){
		Map<String, Contact> contacts = new HashMap<>();
		contacts.put("Mohit", new Contact("8965741263", "Mohit", 
				parse("1987-12-30"), "mohitdk2@gmail.com"));
		contacts.put("Linay", new Contact("8965753263", "Linay", 
				parse("1998-11-10"), "linay@gmail.com"));
		contacts.put("Pratik", new Contact("8799341263", "Pratik", 
				parse("1925-05-12"), "pratik@gmail.com"));
		return contacts;	
	}
	
	/**
	 * @param contactMap
	 * @param sc
	 * @throws ContactBookException
	 */
	public static void addContactDetails(Map<String, Contact> contactMap, Scanner sc) 
			throws ContactBookException {
		System.out.println("Enter Details: [Phone Number, Name, DOB(yyyy-MM-dd), Email(Optional)]");
		Contact contact = inputValidation(sc.next(), sc.next(), 
				sc.next(), sc.next(), contactMap);
		contactMap.put(contact.getName(), contact);
		System.out.println("Contact Added Successfully...");		
	}
	
	public static void displayAllContacts(Map<String, Contact> contactMap, Scanner sc) 
			throws ContactBookException {
		for(Contact contact : contactMap.values())
			System.out.println(contact);
	}
	
	public static void updateContactDetails(Map<String, Contact> contactMap, Scanner sc) 
			throws ContactBookException {
		System.out.println("Enter Name: ");
		String name = sc.next();
		System.out.println("Enter DOB: ");
		LocalDate date = parse(sc.next());	
		Contact contact = contactMap.get(name);
		if((contact.getName().equals(name)) && (contact.getDob().equals(date))){
			System.out.println("If you want to update Email press 1:\n"
					+ "if you want to update Phone Number press 2\n");
			int choice = sc.nextInt();
			Contact c = contactMap.get(name);
			if(choice == 1) {
				System.out.println("Enter Email: ");
				String email = sc.next();
				c.setEmail(email);
			}
			else if(choice == 2) {
				System.out.println("Enter Phone Number: ");
				String pNo = sc.next();
				c.setpNo(pNo);
			}
			else {
				System.out.println("Invalid Choice!!!");
			}
		}
	}
	
	public static void removeAllContactsAbove80yrs(Map<String, Contact> contactMap, Scanner sc) 
			throws ContactBookException {
		LocalDate date  = LocalDate.now().minusYears(80);
		for(Contact c : contactMap.values()) {
			if(c.getDob().isBefore(date)) {
				contactMap.remove(c.getName());
			}
		}
		System.out.println("Contact Removed...");
	}
	
}
