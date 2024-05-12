package cdac.java.q7.tester;

import static cdac.java.q7.utils.ItemUtils.addItem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import cdac.java.q7.item.Item;
import static cdac.java.q7.utils.ItemUtils.sortByItemCode;
import static cdac.java.q7.utils.ItemUtils.sortByItemPrice;

public class ItemTester {

	public static void main(String[] args) {
		System.out.println("Welcome");
			
		try(Scanner sc = new Scanner(System.in)){
			Map<String, Item> itemMap = new HashMap<>();
			boolean exit = false;
			int choice;
			
			do {
				System.out.println("Menu: \n");
				System.out.println("1. Store Item "
						+ "[Item Code, Description, Price, Shipment Date].\n"
						+ "2. Sort By Item Code and Store it in file.\n"
						+ "3. Sort By Item Price and Store it in file.\n"
						+ "0. Exit\n");
				System.out.println("Enter Choice: ");
				choice = sc.nextInt();
				try {
					switch(choice) {
					case 1:
						addItem(itemMap, sc);
						break;
						
					case 2:
						sortByItemCode(itemMap, sc);
						break;
						
					case 3:
						sortByItemPrice(itemMap, sc);
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
