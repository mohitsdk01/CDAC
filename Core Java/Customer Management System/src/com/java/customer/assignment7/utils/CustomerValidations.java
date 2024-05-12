package com.java.customer.assignment7.utils;

import java.time.LocalDate;
//import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.java.customer.assignment7.Exceptions.CustomerManagementException;
import com.java.customer.assignment7.customer.Customer;
import com.java.customer.assignment7.customer.ServicePlan;
//import static com.java.customer.assignment7.utils.CustomerUtils.emailValidationInList;
//import com.java.customer.assignment7.customer.Customer;

public class CustomerValidations {
	
	public static Customer validateInput(String firstName, String lastName, String email
			, String password, double registrationAmt, 
			String dob, String servicePlans, List<Customer> list) 
					throws CustomerManagementException {
		ServicePlan plan = validatePlans(servicePlans);
		servicePlanValidator(plan, registrationAmt);
		emailValidator(email);
//		emailValidationList(email, list);
		passwordValidator(password);
		duplicateAccountCheck(email, list);
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
//		if(!(email.contains("@") && email.contains(".com") ||
//				(email.contains(".org")|| email.contains(".net")))) {
//			throw new CustomerManagementException(email + "is not valid as per E-Mail norms!");
//		}
		
		 // Check if email contains '@' and '.'
        if (email == null || email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            throw new CustomerManagementException(email + 
            		" Not Valid! Enter Like sample123@gmail.com");
        }

        // Check if '@' appears before '.'
        int atIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");
        if (atIndex >= dotIndex) {
        	throw new CustomerManagementException(email + 
            		" Not Valid! Enter Like sample123@gmail.com");
        }

        // Check if '.' is not the last character
        if (dotIndex == email.length() - 1) {
        	throw new CustomerManagementException(email + 
            		" Not Valid! Enter Like sample123@gmail.com");
        }

        // Check if '@' is not the first character
        if (atIndex == 0) {
        	throw new CustomerManagementException(email + 
            		" Not Valid! Enter Like sample123@gmail.com");
        }
	}
	
	private static void servicePlanValidator(ServicePlan service, double payment) 
			throws CustomerManagementException {
		if(payment < service.getPlan()) {
			throw new CustomerManagementException("Your Payment is not "
					+ "enough to get your subscription!!!");
		}
	}
	
	private static void duplicateAccountCheck(String email, List<Customer> accounts) 
			throws CustomerManagementException {
		Customer cust = new Customer(email);
		int idx = accounts.indexOf(cust);
		if(idx >= 0) {
			throw new CustomerManagementException(email + "Already Exists! "
					+ "Try Another Email or Login by existing E-mail.");
		}
	}
	
//	private static void emailValidationList(String email, List<Customer> accounts) 
//			throws CustomerManagementException {
//		Customer cust = new Customer(email);
//		int index = accounts.indexOf(cust);
//		if(index == -1) {
//			throw new CustomerManagementException("Invalid Email!!!");
//		}
//	}
	
	private static void passwordValidator(String password) 
			throws CustomerManagementException {
		String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{5,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		boolean matchPass = matcher.matches();
		if(!matchPass) {
			throw new CustomerManagementException("Password is Weak! Enter Password as per the norms...");
		}
	}
}
