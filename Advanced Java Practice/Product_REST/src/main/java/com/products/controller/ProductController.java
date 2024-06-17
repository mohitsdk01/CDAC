package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.dtos.ApiResponse;
import com.products.entities.Product;
import com.products.services.ProductService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
		
	}
	
	@GetMapping("/{productId}")
	@Operation(description = "Get Product details by id ")
	public ResponseEntity<?> getProductDetails(@PathVariable Long productId){
		try {
			return ResponseEntity.status(HttpStatus.OK)
					.body(productService.getProductById(productId));
		}catch (Exception e) {
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(new ApiResponse(e.getMessage()));
		}
	}
	
	@PutMapping("/{id}")
	@Operation(description = "Update Product details")
	public ResponseEntity<?> updateProduct(@PathVariable Long id, @RequestBody Product product){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(productService.updateProductDetails(id, product));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteProduct(@PathVariable Long id){
		return ResponseEntity.ok(productService.deleteProductDetails(id));
	}
	
	@PatchMapping("/{id}")
	@Operation(description = "Update the product category")
	public ResponseEntity<?> updateProductcategory(@PathVariable Long id, @RequestBody Product product){
		return ResponseEntity
				.status(HttpStatus.OK)
				.body(productService.updateCategory(id, product));
	}
}
