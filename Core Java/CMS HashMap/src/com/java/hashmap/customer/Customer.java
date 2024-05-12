package com.java.hashmap.customer;

import java.time.LocalDate;


public class Customer {
	private static int currentId = 100;
	private static int highestUsedId = 0;
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String Password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan sPlans;
	
	
	public Customer(int id, String firstName, String lastName, 
			String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan sPlans) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.Password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.sPlans = sPlans;
	}
	
	public static int getNextId() {
		currentId = Math.max(currentId, highestUsedId) + 1;
		highestUsedId = currentId;
	    return ++currentId;
	  }

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Customer [ID=" + id + ", First Name=" + firstName + ", Last Name=" + lastName + ", E-mail=" + email
				+ ", Password=" + Password + ", Registration Amount=" + registrationAmount + ", dob=" + dob + ", Service Plans="
				+ sPlans + "]";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Customer() {
		super();
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
}
