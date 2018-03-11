package com.payu.prueba.model;

import javax.persistence.*;

@Entity
public class Client {
	private int clientId;
	private String name;
	private String email;
	
	
	@Id
	@Column(name = "client_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getClientId() {
		return clientId;
	}
	
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	

	
	
	
}