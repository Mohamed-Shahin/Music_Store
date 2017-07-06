package com.musicstore.dao.impl;


import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musicstore.dao.ProductDao;
import com.musicstore.model.Product;
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao{
	@Autowired
	private SessionFactory sessionFactory ;
	
	public void addProduct(Product product) {
		// get current Hibernate  session
		Session session = sessionFactory.getCurrentSession();
		// create sql query
		session.saveOrUpdate(product);
		// execute query
		session.flush();
	}

	
	public Product getProduct(String id) {
		/// get current Hibernate  session
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class,id);
		
		return product;
	}

	
	public List<Product> getProducts() {
		 Session session = sessionFactory.getCurrentSession();
		 
		 Query<Product> query = session.createQuery("from Product",Product.class);
	     List<Product> products = query.getResultList(); 
	     session.flush();
	        return products;
	}


	@Override
	public void deleteProduct(String id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		session.delete(getProduct(id));
		session.flush();
		
	}

}
