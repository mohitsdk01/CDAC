package com.app.fruits.tester;

import com.app.fruits.*;
import java.util.Scanner;
public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Basket: ");
		Fruits[] fruitBasket = new Fruits[sc.nextInt()];
		
		boolean exit = false;
		int counter = 0;
		while(!exit) {
			System.out.println("Options : 1. Add Mango \n"
					+ "2. Add Orange \n"
					+ "3. Add Apple\n"
					+ "4. Display names of all fruits in the basket\n"
					+ "5. Display name,color,weight , taste of all fresh fruits , in the basket\n"
					+ "6. Mark a fruit in a basket , as stale \n"
					+ "7. Mark all sour fruits stale\n"
					+ "8. Invoke fruit specific functionality\n"
					+ "9. Exit");
			System.out.println("Choose an option");
			switch(sc.nextInt()) {
			case 1:
				if(counter < fruitBasket.length) {
					System.out.println("Enter Mango Details: (color, weight, name)");
					fruitBasket[counter] = new Mango(sc.next(), sc.nextDouble(), sc.next());
					counter++;	
					System.out.println("Mango Added in basket...");
				}
				else {
					System.out.println("Basket is Full!");
				}
				break;
				
			case 2:
				if(counter < fruitBasket.length) {
					System.out.println("Enter Orange Details: (Color, Weight, Name)");
					fruitBasket[counter] = new Orange(sc.next(), sc.nextDouble(), sc.next());
					counter++;	
					System.out.println("Orange Added in basket...");
				}
				else {
					System.out.println("Basket is Full!");
				}
				break;
			case 3:
				if(counter < fruitBasket.length) {
					System.out.println("Enter Apple Details: (color, weight, name)");
					fruitBasket[counter] = new Apple(sc.next(), sc.nextDouble(), sc.next());
					counter++;	
					System.out.println("Apple Added in basket...");
				}
				else {
					System.out.println("Basket is Full!");
				}
				break;
				
			case 4:
				System.out.println("The Name of All Fruits in Baskets are: ");
				for(Fruits fruit : fruitBasket) {
					if(fruit != null) {
						System.out.println(fruit.getName());
					}
				}
				break;
				
			case 5:
				System.out.println("The name,color,weight , taste of all fresh fruits: ");
				for(Fruits fruit : fruitBasket) {
					if(fruit.isFresh()) {
					System.out.println(fruit + fruit.taste());}
//					if(fruit != null) {
//						System.out.println(fruit);
//					}
				}
				break;
			case 6:
//				int ser = 0;
				System.out.println("Enter the Index of Fruit: ");
				int idx = sc.nextInt();
//				System.out.println("Enter the fruit Name: ");
//				String fruitName = sc.next();
//				if(fruitBasket[idx].getName().equals(fruitName)) {
					fruitBasket[idx].setFresh(false);
					System.out.println("Fruit: " + fruitBasket[idx].getName() + " set as stale.");
//				}
//				else if(ser > counter){
//					System.out.println("Invalid Data...");
//				}
//				else {
//					System.out.println("Stale.");
//				}
				break;
				
			case 7:
				System.out.println("The name,color,weight ,taste of all fresh fruits: ");
				System.out.println("Enter the Fruit Index: ");
				for(Fruits fruit : fruitBasket) {
					if(fruit.taste().equals("Sour")) {
						fruit.setFresh(false);
						System.out.println("Fruit is Sour and Stale!");
					}
					else {
						System.out.println("Fruit is not Stale...");
					}
				}
				break;
				
			case 8:
				System.out.println("Enter the Serial Number of fruit: ");
				int index = sc.nextInt()- 1;
				if (index >= 0 && index < counter) {
					Fruits fruit = fruitBasket[index];
					if(fruit instanceof Mango)
					 ((Mango)fruit).pulp();
					else if (fruit instanceof Orange)
						((Orange)fruit).juice();
					else ((Apple)fruit).jam();
				}
				break;
				
			case 9:
				exit = true;
				break;
			}
		}
		sc.close();
	}
}
