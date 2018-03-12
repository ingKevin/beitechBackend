package com.payu.prueba.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payu.prueba.model.*;
import com.payu.prueba.service.*;

@RestController
public class ProductClientController {
	
	protected ObjectMapper mapper;

	@Autowired
	protected ProductClientService productClientService;
	
	@RequestMapping(value= "/getProductsByClient", method = RequestMethod.POST)
	public List<Product> getClientsWithProduct(@RequestBody String clientJson)
			throws JsonParseException, JsonMappingException, IOException{
		this.mapper = new ObjectMapper();
		Client client = this.mapper.readValue(clientJson, Client.class);		
		List<ProductClient> productClient = this.productClientService.findByClient(client);
		
		List<Product> products = new ArrayList<>();
		for(ProductClient productClient1 : productClient){
			products.add(productClient1.getProduct());
		}
		return products;
		
	}
	
}
