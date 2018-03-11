package com.payu.prueba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payu.prueba.model.Client;
import com.payu.prueba.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	protected ClientRepository clientRepository;

	@Override
	public Client save(Client client) {
		return this.clientRepository.save(client);
	}
	
	
}
