package com.payu.prueba.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Client {
	private int clientId;
	private String name;
	private String email;
	private List<Product> products;
	
	public Client(){
		
	}	
	
	public Client(int clientId, String name, String email) {
		super();
		this.clientId = clientId;
		this.name = name;
		this.email = email;
	}	

	public Client(int clientId, String name, String email, List<Product> products) {
		super();
		this.clientId = clientId;
		this.name = name;
		this.email = email;
		this.products = products;
	}

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
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "product_client", 
	joinColumns = @JoinColumn(name = "client_id",referencedColumnName = "client_id"), 
	inverseJoinColumns = @JoinColumn(name = "product_id",referencedColumnName = "product_id"))
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
	
}