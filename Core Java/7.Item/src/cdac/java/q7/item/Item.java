package cdac.java.q7.item;

import java.io.Serializable;
import java.time.LocalDate;

public class Item implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7201688202269959364L;
	private String itemCode;
	private String desc;
	private double price;
	private LocalDate shipmentDate;
	
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", desc=" + desc + ", price=" + price + ", shipmentDate=" + shipmentDate
				+ "]";
	}
	
	public Item(String itemCode, String desc, double price, LocalDate shipmentDate) {
		super();
		this.itemCode = itemCode;
		this.desc = desc;
		this.price = price;
		this.shipmentDate = shipmentDate;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getShipmentDate() {
		return shipmentDate;
	}

	public void setShipmentDate(LocalDate shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	
	
}
