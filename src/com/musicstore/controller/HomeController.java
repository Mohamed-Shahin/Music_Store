package com.musicstore.controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.musicstore.model.Product;
import com.musicstore.dao.ProductDao;
import com.musicstore.dao.impl.ProductDaoImpl;

@Controller
public class HomeController {
	@Autowired
	private ProductDao p ;
@RequestMapping("/")
public String home(){
	
	return "home" ;
}
@RequestMapping("/productList")
public String getProducts(Model model){
	// create List 
	List<Product> productList = new ArrayList<Product>();
	// get product1 from productDao class 
	productList = p.getProducts();

	// add products list to model 
	model.addAttribute("theProducts", productList);
	return "productList" ;
}
@RequestMapping("/productList/viewProduct/{productId}")
public String viewProduct(@PathVariable String productId, Model model) throws IOException{
	
	Product product = p.getProduct(productId);
	model.addAttribute(product);
	return "viewProduct";
}
@RequestMapping("/admin")
public String adminPage(){
	return "admin";
}
@RequestMapping("/admin/productInventory")
public String productInventoryPage(Model model){
	// create List 
	List<Product> productList = new ArrayList<Product>();
	// get product1 from productDao class 
	productList = p.getProducts();

	// add products list to model 
	model.addAttribute("theProducts", productList);
	return "product-inventory";
}
@RequestMapping("/admin/productInventory/addProduct")
public String addProductPage(){
	return "add-product";
}

}
