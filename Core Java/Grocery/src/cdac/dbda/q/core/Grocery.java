package cdac.dbda.q.core;

import java.time.LocalDateTime;

public class Grocery {
	private String name;
	private double price;
	private int quantity;
	private LocalDateTime dateTime;
	
	
	@Override
	public String toString() {
		return "Grocery [name=" + name + ", price=" + price + ", quantity=" + quantity + ", dateTime=" + dateTime + "]";
	}

	/**
	 * @param name
	 * @param price
	 * @param quantity
	 * @param dateTime
	 */
	public Grocery(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.dateTime = LocalDateTime.now();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	
	
}
