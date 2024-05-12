package com.java.hashmap.customer.utils;

import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDate.parse;
import com.java.hashmap.customer.*;
import static com.java.hashmap.customer.ServicePlan.DIAMOND;
import static com.java.hashmap.customer.ServicePlan.GOLD;
import static com.java.hashmap.customer.ServicePlan.PLATINUM;
import static com.java.hashmap.customer.ServicePlan.SILVER;
public class CustomerUtils {
//	Add public static method to return a list populated with Customer accounts
	public static Map<String,Customer> populateMap() {
		Map<String,Customer> accts = new HashMap<>();//up casting
		accts.put("mohitdk2@gmail.com",new Customer(101,"Mohit", "Kirange", "mohitdk2@gmail.com", 
				"Mohit@01", 5000, parse("2001-11-10"), DIAMOND));
		accts.put("linay@gmail.com", new Customer(102,"Linay", "Bharambe", "linay@gmail.com", 
				"linay@01", 10000, parse("2001-06-05"), PLATINUM));
		accts.put("Prad@gmail.com", new Customer(103,"Pratik", "Kulkarni", "prad@gmail.com", 
				"Prak@01", 5000, parse("2006-04-25"), DIAMOND));
		accts.put("vasant@gmail.com",new Customer(104,"Vasant", "Jaisal", "vasant@gmail.com", 
				"vasanti@01", 5000, parse("2024-04-15"), DIAMOND));
		
		return accts;
	}
}
