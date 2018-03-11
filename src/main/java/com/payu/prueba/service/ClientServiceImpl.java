package com.payu.prueba.service;

import java.util.List;

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
	
	@Override
	public List<Client> findAll() {
		return this.clientRepository.findAll();
	}
	
	@Override
	public void deleteClient(int id) {
		this.clientRepository.deleteById(id);
	}
	
}
