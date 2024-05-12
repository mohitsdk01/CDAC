package cdac.java.q5.utils;

import java.util.HashMap;
import java.util.Map;

import cdac.java.q5.core.Category;
import cdac.java.q5.core.Order;
import cdac.java.q5.core.Pet;


public class DummyDataUtils {
	
	public static Map<String, String> populateAdminmap(){
		Map<String, String> map = new HashMap<>();
		
		map.put("admin1", "admin1");
		map.put("admin2", "admin2");
		return map;
	}
	
	public static Map<String, String> populateCustMap(){
		Map<String, String> map = new HashMap<>();
		
		map.put("c1", "c1");
		map.put("c2", "c2");
		return map;
	}
	
	public static Map<Integer, Pet> populatePet(){
		Map<Integer, Pet> pets = new HashMap<>();
		pets.put(101, new Pet(101, "British Shorthair", Category.CAT, 500, 20));
        pets.put(102, new Pet(102, "Labrador Retriever", Category.DOG, 1000, 15));
        pets.put(103, new Pet(103, "Dutch Rabbit", Category.RABBIT, 200, 10));
        pets.put(104, new Pet(104, "Goldfish", Category.FISH, 5, 50));
        pets.put(105, new Pet(105, "Siamese Cat", Category.CAT, 600, 25));
        pets.put(106, new Pet(106, "German Shepherd", Category.DOG, 1200, 12));
        pets.put(107, new Pet(107, "Mini Rex Rabbit", Category.RABBIT, 150, 8));
        pets.put(108, new Pet(108, "Betta Fish", Category.FISH, 3, 30));
        pets.put(109, new Pet(109, "Persian Cat", Category.CAT, 700, 18));
        pets.put(110, new Pet(110, "Golden Retriever", Category.DOG, 1100, 20));
		return pets;
	}
	
	public static Map<Integer, Order> populateOrder(){
		Map<Integer, Order> orders = new HashMap<>();
		orders.put(100, new Order(103, 5));
		orders.put(102, new Order(110, 2));
		orders.put(103, new Order(101, 12));
		orders.put(104, new Order(103, 3));
		return orders;
	}
}
