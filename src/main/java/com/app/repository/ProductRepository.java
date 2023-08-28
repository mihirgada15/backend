package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	public List<Product> findByCategory(String category);

}
