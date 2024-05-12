package com.java.customer.assignment7.utils;

import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.java.customer.assignment7.Exceptions.CustomerManagementException;
import com.java.customer.assignment7.customer.Customer;
import com.java.customer.assignment7.customer.ServicePlan;
//import com.java.customer.assignment7.customer.Customer;

public class CustomerValidations {
	
	public static Customer validateInput(String firstName, String lastName, String email
			, String password, double registrationAmt, 
			String dob, String servicePlans, Map<String, Customer> listMap) 
					throws CustomerManagementException {
		ServicePlan plan = validatePlans(servicePlans);
		servicePlanValidator(plan, registrationAmt);
		emailValidator(email);
		passwordValidator(password);
//		duplicateAccountCheck(email, listMap);
		return new Customer(Customer.getNextId(), firstName, lastName, email, 
				password, registrationAmt, LocalDate.parse(dob), plan);
	}
	
	public static void validationNewPass(String newPass) 
			throws CustomerManagementException {
		passwordValidator(newPass);
	}
	
	private static ServicePlan validatePlans(String plan)
			throws IllegalArgumentException, CustomerManagementException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	private static void emailValidator(String email) 
			throws CustomerManagementException {
		if(!(email.contains("@") && email.contains(".com") ||
				(email.contains(".org")|| email.contains(".net")))) {
			throw new CustomerManagementException(email + "is not valid as per E-Mail norms!");
		}
	}
	
	private static void passwordValidator(String password) 
			throws CustomerManagementException {
		String regex = "(?=(.[0-9]))((?=.[A-Za-z0-9])(?=.[A-Z])(?=.[a-z]))^.{8,}$\r\n";
		if(!regex.matches(password)) {
			throw new CustomerManagementException("Password is Weak! Enter Password as per the norms...");
		}
	}
}
