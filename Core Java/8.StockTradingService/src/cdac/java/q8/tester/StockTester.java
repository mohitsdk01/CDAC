package cdac.java.q8.tester;

import java.util.Map;
import java.util.Scanner;

import cdac.java.q8.stock.Stock;

import static cdac.java.q8.utils.StockUtils.populateMap;
import static cdac.java.q8.utils.StockUtils.availabelStocksOfCompany;
import static cdac.java.q8.utils.StockUtils.purchaseStock;
import static cdac.java.q8.utils.StockUtils.sellStock;
import static cdac.java.q8.utils.StockUtils.saveInFile;
import static cdac.java.q8.utils.StocksValidation.validateInput;

public class StockTester {

	public static void main(String[] args) {
		System.out.println("Welcome to Stock Exchange");
		
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Stock> stockMap = populateMap();
			boolean exit = false;
			int choice;
			
			do {
				System.out.println("Menu: \n");
				System.out.println("1. Add New Stock in Market\n"
						+ "2. View Available stocks by Company Name\n"
						+ "3. Purchase Stocks\n"
						+ "4. Sell Stock\n"
						+ "5. Save and Exit\n"
						+ "6. Show All Stocks\n"
						+ "0. Exit without Save\n");
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						System.out.println("Enter Stock Details: "
								+ "[Stock ID, Stock Name, Company Name, Price, Closing Date, Quantity]");
						Stock stock = validateInput(sc.next(), sc.next(), 
								sc.next(), sc.nextDouble(), sc.next(), sc.nextInt(), stockMap);
						stockMap.put(stock.getStockid(), stock);
						System.out.println("Stock Added Successfullu...");
						break;
						
					case 2:
						availabelStocksOfCompany(stockMap, sc);
						break;
					
					case 3:
						purchaseStock(stockMap, sc);
						break;
						
					case 4:
						sellStock(stockMap, sc);
						break;
						
					case 5:
						saveInFile(stockMap);
						System.out.println("All Details Saved Successfully...");
						exit = true;
						break;
						
					case 6:
						for(Stock s : stockMap.values())
							System.out.println(s);
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
		}catch (Exception e) {
			e.printStackTrace();
		}

	}
}
