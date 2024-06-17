package com.products.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.products.Repository.ProductRepository;
import com.products.custom_exceptions.ResourceNotFoundException;
import com.products.dtos.ApiResponse;
import com.products.dtos.ProductDTO;
import com.products.entities.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public ProductDTO getProductById(Long id) {
		Product product = productRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Invalid id!!!"));
		return mapper.map(product, ProductDTO.class);
	}

	@Override
	public ApiResponse updateProductDetails(Long id, Product product) {
		String msg = "Updation Failed!!!";
		Product updatedProduct = productRepo.findById(id).orElse(null);
		if(updatedProduct != null) {
			updatedProduct.setCategory(product.getCategory());
			updatedProduct.setAvailableQuantity(product.getAvailableQuantity());
			updatedProduct.setPrice(product.getPrice());
			updatedProduct.setProductName(product.getProductName());
			productRepo.save(updatedProduct);
			msg = "Updated category details!";
		}
		else {
			throw new ResourceNotFoundException("Invalid Product Id!");
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse deleteProductDetails(Long id) {
		String msg = "Deletion Failed!";
		Product product = productRepo.findById(id)
				.orElseThrow(()->
				new ResourceNotFoundException("Invalid Product id!"));
		productRepo.delete(product);
		return new ApiResponse("Product deleted: id: " + id);
	}

	@Override
	public ApiResponse updateCategory(Long id, Product product) {
		String msg = "Updation Failed!!!";
		Product updatedProductCategory = productRepo.findById(id).orElse(null);
		if(updatedProductCategory != null) {
			updatedProductCategory.setCategory(product.getCategory());
			msg = "Category Updation Done!!!";
		}else {
			throw new ResourceNotFoundException("Invalid id id: " + id);
		}
		return new ApiResponse(msg);
	}

}
