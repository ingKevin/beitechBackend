package com.payu.prueba.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payu.prueba.model.Client;
import com.payu.prueba.model.Product;
import com.payu.prueba.model.ProductClient;
import com.payu.prueba.repository.ProductClientRepository;

@Service
public class ProductClientServiceImpl implements ProductClientService{

	@Autowired
	protected ProductClientRepository productClientRepository;
	
	@Override
	public ProductClient save(ProductClient productClient) {
		return this.productClientRepository.save(productClient);
	}

	@Override
	public List<ProductClient> findAll() {
		return this.productClientRepository.findAll();
	}

	@Override
	public List<ProductClient> findByClient(Client client) {
		return this.productClientRepository.findByClient(client);
	}

	@Override
	public void deleteProductClient(int id) {
		
		
	}

}
