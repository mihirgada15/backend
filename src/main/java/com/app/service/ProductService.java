package com.app.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.app.request.CreateProductRequest;
import com.app.exception.ProductException;
import com.app.entities.Product;


public interface ProductService {
	
	// only for admin
	public Product createProduct(CreateProductRequest req) throws ProductException;
	
	public String deleteProduct(Long productId) throws ProductException;
	
	public Product updateProduct(Long productId,Product product)throws ProductException;
	
	public List<Product> getAllProducts();
	
	// for user and admin both
	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findProductByCategory(String category);
	
	public Page<Product> getAllProduct(String category, String sort, String stock, Integer pageNumber, Integer pageSize);
	
	
	
	

}
