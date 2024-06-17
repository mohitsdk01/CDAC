package com.products.dtos;


import com.products.entities.Category;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
	Category category;
	private String productName;
	private double price;
	private int availableQuantity;
}
