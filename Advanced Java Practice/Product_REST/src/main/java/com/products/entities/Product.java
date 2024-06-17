package com.products.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Product extends BaseEntity{
	@Enumerated(EnumType.STRING)
	@Column(name = "category_name", length = 60)
	Category category;
	@Column(name = "product_name", length = 50)
	private String productName;
	@Column(name = "product_price", nullable = false)
	private double price;
	@Column(name = "available_Quantity", nullable = false)
	private int availableQuantity;
	
//	public Product(Category category, String productName, double price, int availableQuantity) {
//		super();
//		this.category = category;
//		this.productName = productName;
//		this.price = price;
//		this.availableQuantity = availableQuantity;
//	}
	
	
}
