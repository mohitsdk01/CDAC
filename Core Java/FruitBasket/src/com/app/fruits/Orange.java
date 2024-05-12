package com.app.fruits;

public class Orange extends Fruits {
	public Orange(String color, double weight, String name) {
		super(color, weight, name);
	}
	
	@Override
	public String taste() {
		return "Sour";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void juice() {
		System.out.println(super.getName() + " " + 
	super.getWeight() + " Extracting Juice!");
	}
}
