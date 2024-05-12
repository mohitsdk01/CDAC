package com.practice.events;

public class Faculty extends Person {
	private int yearsOfExp;
	private String sme;
	
	public Faculty(String fName, String lName, int yearExp, String sme) {
		super(fName, lName);
		this.yearsOfExp = yearExp;
		this.sme = sme;
	}
	
	public String toString() {
		return "Name: " + super.toString() + " Year of Experience: " + yearsOfExp + " SME: " +
	sme;
	}
}
