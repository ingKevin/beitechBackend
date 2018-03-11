package com.payu.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payu.prueba.model.Product;
import com.payu.prueba.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	protected ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		return this.productRepository.save(product);
	}
	
	@Override
	public List<Product> findAll() {
		return this.productRepository.findAll();
	}
	
	@Override
	public void deleteProduct(int id) {
		this.productRepository.deleteById(id);
	}
	
}
