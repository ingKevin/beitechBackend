package com.payu.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payu.prueba.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	
}