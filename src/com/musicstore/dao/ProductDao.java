package com.musicstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.musicstore.model.Product;

public class ProductDao {
	private List<Product> productsList ;
	
	public List<Product> getProductList(){
		// setup product 1
		Product product1 = new Product() ;
		product1.setProductName("Guitar");
		product1.setProductDescripation("this is fender guitar");
		product1.setProductCategory("Instrument");
		product1.setProductPrice(1200);
		product1.setUnitInStock(11);
		product1.setProductStatus("Active");
		product1.setProductCondition("new");
		product1.setProductManufacturer("Fender");
		
		// add product to list 
		productsList = new ArrayList<Product>();
		productsList.add(product1);
		
		return productsList ;
	}
}
