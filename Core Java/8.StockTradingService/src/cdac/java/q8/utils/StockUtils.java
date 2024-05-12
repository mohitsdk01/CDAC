package cdac.java.q8.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cdac.java.q8.exceptions.StockException;
import cdac.java.q8.stock.Stock;

public class StockUtils {
	
	public static Map<String ,Stock> populateMap(){
		Map<String,Stock> stockMap = new HashMap<>();
		stockMap.put("111ABC", new Stock("111ABC", "Chromium electronics", 
				"Havells", 200.0, LocalDate.parse("2024-12-23"),50));
		stockMap.put("112ABC", new Stock("112ABC", "Diapers", 
				"Pampers", 20.0, LocalDate.parse("2024-10-02"),50));
		stockMap.put("113XYZ", new Stock("113XYZ", "Laptop", 
				"DELL", 1000.0, LocalDate.parse("2028-02-14"),75));
		stockMap.put("114XYZ", new Stock("114XYZ", "Laptop", 
				"Lenovo", 1200.0, LocalDate.parse("2024-09-24"),75));
		stockMap.put("115XYZ", new Stock("115XYZ", "Pen", 
				"Flair", 80.0, LocalDate.parse("2025-11-15"),100));
		stockMap.put("116UID", new Stock("116UID", "Laptop", 
				"DELL", 5000.0, LocalDate.parse("2024-11-15"),160));
		return stockMap;

	}
	
	
	public static void availabelStocksOfCompany(Map<String, Stock> stockMap, Scanner sc) {
		System.out.println("Enter Company Name: ");
		String companyName = sc.next();
		for(Stock stock : stockMap.values()) {
			if(stock.getCompanyName().equals(companyName)) {
				System.out.println(stock);
			}
		}
	}
	
	public static void purchaseStock(Map<String, Stock> stockMap, Scanner sc) 
			throws StockException {
		System.out.println("Enter Stock ID: ");
		String ID = sc.next();
		if(!stockMap.containsKey(ID)) {
			throw new StockException(ID + " Not Found!");
		}
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		
		Stock stock = stockMap.get(ID);
		stock.setQuantity(stock.getQuantity() - quantity);
		System.out.println(quantity + " Stockes Are Purchased...");
	}
	
	public static void sellStock(Map<String, Stock> stockMap, Scanner sc) 
			throws StockException {
		System.out.println("Enter Stock ID: ");
		String ID = sc.next();
		if(!stockMap.containsKey(ID)) {
			throw new StockException(ID + " Not Found!");
		}
		System.out.println("Enter Quantity: ");
		int quantity = sc.nextInt();
		Stock stock = stockMap.get(ID);
		stock.setQuantity(stock.getQuantity() + quantity);
		System.out.println(quantity + " Stockes Are Sold...");
	}
	
	public static void saveInFile(Map<String, Stock> stockMap) 
			throws FileNotFoundException, IOException {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("StockDetails.txt"))){
			oos.writeObject(stockMap);
		}
	}
}
