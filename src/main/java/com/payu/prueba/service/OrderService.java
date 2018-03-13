package com.payu.prueba.service;

import java.util.List;

import com.payu.prueba.model.Client;
import com.payu.prueba.model.Orders;

public interface OrderService{

	Orders save(Orders client);
	
	List<Orders> findAll();
	
	void deleteOrder(int id);
	
	List<Orders> findByClient(Client client);
	
}
