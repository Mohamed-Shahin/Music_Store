package com.musicstore.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.musicstore.model.Product;
import com.musicstore.dao.ProductDao;

@Controller
public class HomeController {
	private ProductDao p = new ProductDao();
@RequestMapping("/")
public String home(){
	
	return "home" ;
}
@RequestMapping("/productList")
public String getProducts(Model model){
	// create List 
	List<Product> productList = new ArrayList<Product>();
	// get product1 from productDao class 
	productList = p.getProductList();
	
	
	// add products list to model 
	model.addAttribute("theProducts", productList);
	return "productList" ;
}
}
