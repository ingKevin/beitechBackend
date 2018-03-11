package com.payu.prueba.service;


import java.util.List;

import com.payu.prueba.model.Product;

public interface ProductService{

	Product save(Product product);
	
	List<Product> findAll();
	
	void deleteProduct(int id);
	

}