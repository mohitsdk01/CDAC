package com.assignment.day6.stacks;

import java.util.Scanner;

public class Customer {
	private int id;
	private String name;
	private String address;
	Scanner sc = new Scanner(System.in);
	public Customer() {
    }
	
	public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
	
	@Override
	public String toString() {
		
		return "ID: " + id + " Name: " + name + " Address: " + address;
	}



	public void AcceptDetails() {
		
		System.out.println("Enter ID of Customer: ");
		sc.nextInt();
		System.out.println("Enter Name of Customer: ");
		sc.next();
		System.out.println("Enter Address of Customer: ");
		sc.next();
		sc.close();
	}
}
