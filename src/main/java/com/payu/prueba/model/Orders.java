package com.payu.prueba.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Orders {
	
	private int orderId;
	private Date date;
	private String address;
	private int price;
	private Client client;
	
	@Id
	@Column(name = "order_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;		
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
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
