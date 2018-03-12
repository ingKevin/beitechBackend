package com.payu.prueba.model;

import javax.persistence.*;

@Entity
public class ProductClient {
	
	private int id;
	private Product product;
	private Client client;
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@OneToOne
	@JoinColumn(name="product_id")
	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	@OneToOne
	@JoinColumn(name="client_id")
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
}
