package com.app.fruits;

public class Apple extends Fruits{
	public Apple(String color, double weight, String name) {
		super(color, weight, name);
	}
	
	@Override
	public String taste() {
		return "Sweet & Sour";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void jam() {
		System.out.println(super.getName() + " " + " Making Jam!");
	}
}
