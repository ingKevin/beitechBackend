package com.payu.prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payu.prueba.model.Orders;
import com.payu.prueba.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	protected OrderRepository orderRepository;

	@Override
	public Orders save(Orders order) {
		return this.orderRepository.save(order);
	}
	
	@Override
	public List<Orders> findAll() {
		return this.orderRepository.findAll();
	}
	
	@Override
	public void deleteOrder(int id) {
		this.orderRepository.deleteById(id);
	}
	
}
