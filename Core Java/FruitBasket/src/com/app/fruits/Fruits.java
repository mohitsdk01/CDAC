package com.app.fruits;

abstract public class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fruits(String color, double weight, String name) {
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = true;
	}
	
	public double getWeight() {
		return weight;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}
	
	public boolean isFresh() {
		return fresh;
	}


	public abstract String taste();
	
	@Override
	public String toString() {
		return "Name of Fruit: " + name + " Color: " + color + 
				" Weight: " + weight;
	}
}
