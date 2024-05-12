package cdac.dbda.q.utils;


import java.time.LocalDateTime;
import java.util.Map;
import java.util.Scanner;

import cdac.dbda.q.core.Grocery;

public class GroceryUtils {
	public static void addItem(Map<String, Grocery> groMap, Scanner sc) {
		System.out.println("Enter Grocery Details: [Name, Price Per Unit, "
				+ "Quantity]");
		Grocery grocery = new Grocery(sc.next(), sc.nextDouble(), 
				sc.nextInt());
		groMap.put(grocery.getName(), grocery);
		System.out.println("Item Added...");		
	}
	
	public static void updateQuantity(Map<String, Grocery> groMap, Scanner sc) {
		System.out.println("Enter grocery Name: ");
		String groCeryName = sc.next();
		System.out.println("Enter Quantity.");
		int quantity = sc.nextInt();
		Grocery grocery = groMap.get(groCeryName);
		grocery.setQuantity(quantity);
		System.out.println("Grocery Updated Successfully.");
	}
	
	public static void displayList(Map<String, Grocery> groMap, Scanner sc) {
		System.out.println("Enter grocery Name: ");
		String groCeryName = sc.next();
		Grocery grocery = groMap.get(groCeryName);
		
		System.out.println("Name: " + grocery.getName() + " Quantity: " 
		+ grocery.getPrice() + " Quantity: " + grocery.getQuantity());
	}
	
	public static void removeEmptyStock(Map<String, Grocery> groMap, Scanner sc) {
		for(Grocery g : groMap.values()) {
			if(g.getQuantity() == 0)
				groMap.remove(g.getName());
		}
		System.out.println("Empy stocks removed...");
	}
	
	public static void displayStocksUpdatedInLastThree(Map<String, Grocery> groMap, Scanner sc) {
		LocalDateTime dateTime = LocalDateTime.now().minusDays(3);
		for(Grocery g : groMap.values()) {
			if(g.getDateTime().equals(dateTime)) {
				System.out.println(g);
			}
		}
		
	}
	
}
