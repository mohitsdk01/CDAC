package com.practice.events;

public class Student extends Person {
	private int gradYear;
	private String course;
	private double fees;
	private double marks;
	
	public Student(String fName, String lName, int grad, String course, double fees, double marks) {
		super(fName, lName);
		this.gradYear = grad;
		this.course = course;
		this.fees = fees;
		this.marks = marks;
	}
	
	public String toString() {
		return "Name: " + super.toString() + " Graduation Year: " + gradYear + " Course: " +
	course + " Fees: " + fees + " Marks: " + marks;
	}
}
