package com.payu.prueba.repository;

import java.util.List;
import com.payu.prueba.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payu.prueba.model.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer>{
	
	List<Orders> findByClient(Client client);
	
}
