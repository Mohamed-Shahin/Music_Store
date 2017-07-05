package com.musicstore.controller;



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
	
	// get product1 from productDao class 
	Product product = p.getProductList().get(0);
	
	// add products list to model 
	model.addAttribute("theProduct", product);
	return "productList" ;
}
}
