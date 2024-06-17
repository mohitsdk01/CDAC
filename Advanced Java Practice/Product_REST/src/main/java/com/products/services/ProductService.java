package com.products.services;

import java.util.List;

import com.products.dtos.ApiResponse;
import com.products.dtos.ProductDTO;
import com.products.entities.Product;

/*
 * 1.1 Get all products
 * 1.2 Add new product
 */

public interface ProductService {
	List<Product> getAllProducts();
	Product addProduct(Product product);
	ProductDTO getProductById(Long id);
	ApiResponse updateProductDetails(Long id, Product product);
	ApiResponse deleteProductDetails(Long id);
	ApiResponse updateCategory(Long id, Product product);
}
