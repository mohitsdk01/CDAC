package com.app.fruits;

public class Mango extends Fruits{
	public Mango(String color, double weight, String name) {
		super(color, weight, name);
	}
	
	@Override
	public String taste() {
		return "Sweet";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	public void pulp() {
		System.out.println(super.getColor() + " " + 
		super.getName() + " " + " Creating Pulp!");
	}
}
