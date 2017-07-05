package com.musicstore.dao.impl;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.musicstore.dao.ProductDao;
import com.musicstore.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private SessionFactory sessionFactory ;
	
	public void addProduct(Product product) {
		// get current Hibernate  session
		Session session = sessionFactory.getCurrentSession();
		// create sql query
		
		// execute query
		
	}

	
	public Product getProduct(String id) {
		/// get current Hibernate  session
		Session session = sessionFactory.getCurrentSession();
		return null;
	}

	
	public List<Product> getProducts() {
		/// get current Hibernate  session
		Session session = sessionFactory.getCurrentSession();
		return null;
	}

}
