package com.payu.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payu.prueba.model.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer>{
	
}
