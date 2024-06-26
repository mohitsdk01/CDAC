package com.java.customer.assignment7.customer;

import java.io.Serializable;
import java.time.LocalDate;


public class Customer implements Serializable /*implements Comparable<Customer>*/{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2998710587339899837L;
	
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
		Password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.sPlans = sPlans;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("IN equls..");
		if(obj instanceof Customer) {
			Customer c = (Customer)obj;
			return this.email.equals(c.email);
		}
		return false;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public Customer(String email) {
		super();
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", Password=" + Password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", sPlans="
				+ sPlans + "]";
	}
	public static int getNextId() {
		currentId = Math.max(currentId, highestUsedId) + 1;
		highestUsedId = currentId;
	    return ++currentId;
	  }

	public int getId() {
		return id;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
//	@Override
//	public int compareTo(Customer o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
		
}
