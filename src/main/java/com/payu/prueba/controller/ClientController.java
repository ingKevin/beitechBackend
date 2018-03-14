package com.payu.prueba.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payu.prueba.model.*;
import com.payu.prueba.service.*;

@RestController
public class ClientController {
	
	protected ObjectMapper mapper;	
	
	@Autowired
	protected ClientService clientService;	
	
	@RequestMapping(value= "/saveOrUpdateClient", method = RequestMethod.POST)
	public void saveOrUpdateClient(@RequestBody String clientJson) 
			throws JsonParseException, JsonMappingException, IOException{
		
		this.mapper = new ObjectMapper();
		Client client = this.mapper.readValue(clientJson, Client.class);		
		this.clientService.save(client);
	}
	
	@RequestMapping(value= "/getClients", method = RequestMethod.GET)
	public List<Client> getClients(){
		return this.clientService.findAll();
	}	
	
	@RequestMapping(value= "/deleteClient", method = RequestMethod.POST)
	public void deleteClient(@RequestBody String clientJson)throws JsonParseException, JsonMappingException, IOException{		
		this.mapper = new ObjectMapper();
		Client client = this.mapper.readValue(clientJson, Client.class);
		this.clientService.deleteClient(client.getClientId());
	}
	
	
	
}
