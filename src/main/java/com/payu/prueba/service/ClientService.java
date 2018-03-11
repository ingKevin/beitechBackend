package com.payu.prueba.service;

import java.util.List;

import com.payu.prueba.model.Client;

public interface ClientService{

	Client save(Client client);
	
	List<Client> findAll();

}
