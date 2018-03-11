package com.payu.prueba.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.payu.prueba.model.Orders;
import com.payu.prueba.service.OrderService;
import com.payu.prueba.util.RestResponse;

@RestController
public class OrderController {
	
	@Autowired
	protected OrderService orderService;
	
	protected ObjectMapper mapper;
	
	@RequestMapping(value= "/saveOrUpdateOrder", method = RequestMethod.POST)
	public RestResponse saveOrUpdateOrder(@RequestBody String orderJson) 
			throws JsonParseException, JsonMappingException, IOException{
		
		this.mapper = new ObjectMapper();
		Orders order = this.mapper.readValue(orderJson, Orders.class);
		
		this.orderService.save(order);
		return new RestResponse(HttpStatus.OK.value(), "Successfull");
	}
	
	@RequestMapping(value= "/getOrders", method = RequestMethod.GET)
	public List<Orders> getOrders(){
		return this.orderService.findAll();
	}
	
	@RequestMapping(value= "/deleteOrder", method = RequestMethod.POST)
	public void deleteOrder(@RequestBody String orderJson)throws JsonParseException, JsonMappingException, IOException{		
		this.mapper = new ObjectMapper();
		Orders order = this.mapper.readValue(orderJson, Orders.class);
		this.orderService.deleteOrder(order.getOrderId());
	}
}

	

