package com.payu.prueba.model;

import javax.persistence.*;

@Entity
public class Client {
	private int client_id;
	private String name;
	private String email;		
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
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