package cdac.java.q8.stock;

import java.io.Serializable;
import java.time.LocalDate;

public class Stock implements Serializable {
	private String stockid;
	private String stockName;
	private String companyName;
	private double price;
	private LocalDate closingDate;
	private int quantity;
	
	
	
	public Stock(String stockid, String stockName, String companyName, double price, LocalDate closingDate,
			int quantity) {
		super();
		this.stockid = stockid;
		this.stockName = stockName;
		this.companyName = companyName;
		this.price = price;
		this.closingDate = closingDate;
		this.quantity = quantity;
	}

	

	public String getStockid() {
		return stockid;
	}



	public void setStockid(String stockid) {
		this.stockid = stockid;
	}



	public String getStockName() {
		return stockName;
	}



	public void setStockName(String stockName) {
		this.stockName = stockName;
	}



	public String getCompanyName() {
		return companyName;
	}



	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public LocalDate getClosingDate() {
		return closingDate;
	}



	public void setClosingDate(LocalDate closingDate) {
		this.closingDate = closingDate;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Stock [stockid=" + stockid + ", stockName=" + stockName + ", companyName=" + companyName + ", price="
				+ price + ", closingDate=" + closingDate + ", quantity=" + quantity + "]";
	}
	
	
}
