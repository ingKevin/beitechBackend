package com.payu.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.payu.prueba.model.Client;

public interface ClientRepository extends JpaRepository<Client,Integer>{
	
}
