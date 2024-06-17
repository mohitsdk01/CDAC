package com.products.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
