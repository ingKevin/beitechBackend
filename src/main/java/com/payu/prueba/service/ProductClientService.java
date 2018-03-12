package com.payu.prueba.service;

import java.util.List;

import com.payu.prueba.model.*;

public interface ProductClientService {
	
	ProductClient save(ProductClient productClient);
	
	List<ProductClient> findAll();
	
	List<ProductClient> findByClient(Client client);
	
	void deleteProductClient(int id);
	
	
	
}
