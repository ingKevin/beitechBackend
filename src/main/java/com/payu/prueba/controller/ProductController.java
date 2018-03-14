package com.payu.prueba.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payu.prueba.model.Product;
import com.payu.prueba.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	protected ProductService productService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value= "/saveOrUpdateProduct", method = RequestMethod.POST)
	public void saveOrUpdateProduct(@RequestBody String productJson) 
			throws JsonParseException, JsonMappingException, IOException{		
		this.mapper = new ObjectMapper();
		Product product = this.mapper.readValue(productJson, Product.class);		
		this.productService.save(product);
	}
	
	@RequestMapping(value= "/getProducts", method = RequestMethod.GET)
	public List<Product> getProducts(){
		return this.productService.findAll();
	}
	
	@RequestMapping(value= "/deleteProduct", method = RequestMethod.POST)
	public void deleteProduct(@RequestBody String productJson)throws JsonParseException, JsonMappingException, IOException{		
		this.mapper = new ObjectMapper();
		Product product = this.mapper.readValue(productJson, Product.class);
		this.productService.deleteProduct(product.getProductId());
	}
}
