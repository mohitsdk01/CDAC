package com.java.customer.assignment7.utils;

import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.customer.assignment7.Exceptions.CustomerManagementException;
import com.java.customer.assignment7.customer.Customer;
import static com.java.customer.assignment7.customer.ServicePlan.DIAMOND;
import static com.java.customer.assignment7.customer.ServicePlan.GOLD;
import static com.java.customer.assignment7.customer.ServicePlan.PLATINUM;
import static com.java.customer.assignment7.customer.ServicePlan.SILVER;


public class CustomerUtils {
	public static int emailValidator(Map<String, Customer> custMap,Customer cust) 
			throws CustomerManagementException {
		int index = custMap.indexOf(cust);
		if(index == -1) {
			throw new CustomerManagementException("Invalid Email!!!");
		}
		return index;
	}
	public static boolean passwordValidator(String userEnterdPass, String pass) 
			throws CustomerManagementException {
		if(userEnterdPass.equals(pass)) {
			System.out.println("Welcome to Customer Management System...");
			return true;
		}
		else
			throw new CustomerManagementException("Youer entered "
					+ "password is incorrect!!!");
	}
	
//		Add public static method to return a list populated with bank accounts
		public static Map<String, Customer> populateList() {
			Map<String,Customer> accts = new HashMap<>();//up casting
			accts.put("mohitdk2@gmail.com",new Customer(101,"Mohit", "Kirange", "mohitdk2@gmail.com", 
					"Mohit@01", 5000, parse("2001-11-10"), DIAMOND));
			accts.put("linay@gmail.com",new Customer(102,"Linay", "Bharambe", "linay@gmail.com", 
					"linay@01", 10000, parse("2001-06-05"), PLATINUM));
			accts.put("prad@gmail.com",new Customer(103,"Pratik", "Kulkarni", "prad@gmail.com", 
					"Prak@01", 5000, parse("2006-04-25"), DIAMOND));
			accts.put("vasant@gmail.com",new Customer(104,"Vasant", "Jaisal", "vasant@gmail.com", 
					"vasanti@01", 5000, parse("2024-04-15"), DIAMOND));
			
			return accts;
		}
}
