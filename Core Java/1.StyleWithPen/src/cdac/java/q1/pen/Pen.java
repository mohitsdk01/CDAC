package cdac.java.q1.pen;

import java.time.LocalDate;

public class Pen {
	private static int idCounter = 100;
	private int id;
	private Brand brand;
	private String color;
	private String inkColor;
	private String material;
	private int stock;
	private LocalDate listingDate;
	private LocalDate stockUpdateDate;
	private double price;
	
	
	public Pen(Brand brand, String color, String inkColor, String material, 
			int stock, LocalDate listingDate, LocalDate stockUpdateDate, double price) {
		super();
		this.id = idCounter++;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.listingDate = listingDate;
		this.stockUpdateDate = stockUpdateDate;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", listingDate=" + listingDate + ", stockUpdateDate="
				+ stockUpdateDate + ", price=" + price + "]";
	}

	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getId() {
		return id;
	}

	public String getColor() {
		return color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public String getMaterial() {
		return material;
	}

	public int getStock() {
		return stock;
	}

	public LocalDate getListingDate() {
		return listingDate;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public double getPrice() {
		return price;
	}
	
	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public Brand getBrand() {
		return brand;
	}
}
