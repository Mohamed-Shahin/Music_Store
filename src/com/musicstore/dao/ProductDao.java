package com.musicstore.dao;

import java.util.ArrayList;
import java.util.List;

import com.musicstore.model.Product;

public class ProductDao {
	private List<Product> productsList ;
	
	public List<Product> getProductList(){
		// create  product 1
		Product product1 = new Product() ;
		product1.setProductName("Guitar");
		product1.setProductDescripation("this is fender guitar");
		product1.setProductCategory("Instrument");
		product1.setProductPrice(1200);
		product1.setUnitInStock(11);
		product1.setProductStatus("Active");
		product1.setProductCondition("new");
		product1.setProductManufacturer("Fender");
		// create product 2
		Product product2 = new Product() ;
		product2.setProductName("speaker");
		product2.setProductDescripation("this is polk shelf speaker");
		product2.setProductCategory("Accessory");
		product2.setProductPrice(250);
		product2.setUnitInStock(25);
		product2.setProductStatus("Active");
		product2.setProductCondition("new");
		product2.setProductManufacturer("Polk");
		// create product 3
		Product product3= new Product() ;
		product3.setProductName("Guitar");
		product3.setProductDescripation("this is awesome mix ");
		product3.setProductCategory("Record");
		product3.setProductPrice(30);
		product3.setUnitInStock(25);
		product3.setProductStatus("Active");
		product3.setProductCondition("new");
		product3.setProductManufacturer("MSU");		
		// add products to list 
		productsList = new ArrayList<Product>();
		productsList.add(product1);
		productsList.add(product2);
		productsList.add(product3);
		
		return productsList ;
	}
}
