package com.musicstore.dao;

import java.util.List;

import com.musicstore.model.Product;

public interface ProductDao {
	 void addProduct(Product product);
	 Product getProduct(String id);
	 List<Product> getProducts();
	
}
