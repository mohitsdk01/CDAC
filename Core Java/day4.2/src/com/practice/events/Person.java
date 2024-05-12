package com.practice.events;
import java.lang.*;
public class Person {
	private String firstName;
	private String lastName;
	public Person(String fName, String lName) {
		this.firstName = fName;
		this.lastName = lName;
	}
	
	public String toString() {
		return firstName + " " + lastName;
	}
}
