package com.java.hashmap.customer.utils;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.java.hashmap.customer.exceptions.*;
import com.java.hashmap.customer.Customer;
import com.java.hashmap.customer.ServicePlan;
import static java.time.LocalDate.parse;

public class CustomerValidations {
	
	public static Customer inputvalidator(String firstName, String lastName, String email
			, String password, double registrationAmt, String dob, String servicePlans, 
			Map<String, Customer> custMap) throws IllegalArgumentException, CustomerManagementException {
		
		isDuplicateAccount(email, custMap);
		emailValidator(email);
		passwordValidator(password);
		ServicePlan plan = validatePlan(servicePlans);
		customerServicePlanValidator(plan, registrationAmt);
		
		return new Customer(Customer.getNextId(), firstName, lastName, 
				email, password, registrationAmt, parse(dob), plan);
		
	}
	
	private static ServicePlan validatePlan(String plan) 
			throws IllegalArgumentException, CustomerManagementException{
		return ServicePlan.valueOf(plan.toUpperCase());
	}
	
	private static void isDuplicateAccount(String email, Map<String, Customer> customerMap) 
			throws CustomerManagementException {
		
		if(customerMap.containsKey(email)) {
			throw new CustomerManagementException
			(email + " is Already Exists. Please Create Account with Another E-Mail");
		}
	}
	
	private static void customerServicePlanValidator(ServicePlan service, double payment)
			throws CustomerManagementException {
		if(payment < service.getPlan()) {
			throw new CustomerManagementException("Your Payment is not \"\r\n"
					+ "+ \"enough to get your subscription!!!");
		}
	}
	
	private static void emailValidator(String email)
			throws CustomerManagementException {
		String regex = "[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches()) {
			throw new CustomerManagementException(email + " Not must include required changes.");
		}
	}
	
	private static void passwordValidator(String password) throws CustomerManagementException {
		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{5,}$";
		Pattern pattern =Pattern.compile(regex);
		Matcher matcher=pattern.matcher(password);
		if(!matcher.matches())
			throw  new CustomerManagementException(password +
					" Password is Weak! Enter Password as per the norms...");
	}
	
	
}






