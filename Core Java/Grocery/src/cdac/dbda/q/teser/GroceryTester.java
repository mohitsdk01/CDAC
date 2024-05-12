package cdac.dbda.q.teser;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cdac.dbda.q.core.Grocery;
import static cdac.dbda.q.utils.GroceryUtils.addItem;
import static cdac.dbda.q.utils.GroceryUtils.updateQuantity;
import static cdac.dbda.q.utils.GroceryUtils.displayList;
import static cdac.dbda.q.utils.GroceryUtils.removeEmptyStock;
import static cdac.dbda.q.utils.GroceryUtils.displayStocksUpdatedInLastThree;

public class GroceryTester {

	public static void main(String[] args) {
		System.out.println("Welcome to Grocery Store");
		
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Grocery> groMap = new HashMap<>();
			boolean exit = false;
			int choice;
			
			do {
				System.out.println("Menu:\n");
				System.out.println("1. Add New Grocery.\n"
						+ "2. Update Quantity of grocery stock.\n"
						+ "3. Display the list of Grocery items including "
						+ "their name. prices, and quantity.\n"
						+ "4. Remove All empty Stocks items.\n"
						+ "5. Display all stocks which updated in last 3 days.\n"
						+ "0. Exit");
				System.out.println("Enter choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						addItem(groMap, sc);
						
						break;
						
					case 2:
						updateQuantity(groMap, sc);
						break;
						
					case 3:
						displayList(groMap, sc);
						break;
						
					case 4:
						removeEmptyStock(groMap, sc);
						break;
						
					case 5:
						displayStocksUpdatedInLastThree(groMap, sc);
						break;
						
					case 0:
						exit = true;
						break;
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}while(!exit);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
