package cdac.java.q4.utils;

import static java.time.LocalDate.parse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cdac.java.q4.cricket.Cricketer;
import cdac.java.q4.exceptions.CricketException;

public class CricketerUtils {
	
	public static Map<String, Cricketer> populateMap(){
		Map<String, Cricketer> cricMap = new HashMap<>();
		cricMap.put("rohit@gmail.com", new Cricketer("Rohit", "Sharma", 
				36, "rohit@gmail.com", "8999257171", 89));
		cricMap.put("virat@gmail.com", new Cricketer("Virat", "Kohali", 
				35, "virat@gmail.com", "8806687581", 88));
		cricMap.put("dk@gmail.com", new Cricketer("Dinesh", "Kartik", 
				37, "dk@gmail.com", "8975632445", 68));
		cricMap.put("msdhoni@gmail.com", new Cricketer("MS", "Dhoni", 
				41, "msdhoni@gmail.com", "7845731058", 83));
		cricMap.put("jasprit@gmail.com", new Cricketer("Jasprit", "Bumrah", 
				30, "jasprit@gmail.com", "6354893109", 90));
		return cricMap;
	}
	
	public static void modifyCricketerRatings(Map<String, Cricketer> crickMap, Scanner sc)
			throws CricketException{
		
		System.out.println("Enter Cricketer's First Name to whom you want to give rating: ");
		String name  = sc.next();
		System.out.println("Enter Rating: ");
		int rating = sc.nextInt();
		
		for(Cricketer c : crickMap.values()) {
			if(c.getFirstName().equalsIgnoreCase(name)) {
				c.setRating(rating);
				return;
			}
//			else throw new CricketException("Player Not Found!!!");
			else System.out.println("Player Not Found!!!");
		}
	}
	
	public static void searchCricketerByName(Map<String, Cricketer> crickMap, Scanner sc) 
			throws CricketException{
		System.out.println("Enter Cricketer's First Name and Last Name: ");
		String fName  = sc.next();
		String lName = sc.next();
		for(Cricketer c : crickMap.values()) {
			if(c.getFirstName().equalsIgnoreCase(fName) 
					&& c.getLastName().equalsIgnoreCase(lName)) {
				System.out.println("Player is Found: " + c.getFirstName() + " " + c.getLastName());
				return;
			}
			else System.out.println("Player Not Found!!!");
		}
	}
}
