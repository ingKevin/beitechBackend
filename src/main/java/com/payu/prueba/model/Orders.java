package com.payu.prueba.model;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Orders {
	
	private int orderId;
	private Date date;
	private String address;
	private int price;
	private Client client;
	private List<Product> products;
	
	public Orders(){
		
	}
	
	public Orders(int orderId,	Date date, String address, int price, Client client){
		this.orderId = orderId;
		this.date = date;
		this.address=  address;
		this.price = price;
		this.client =  client;
	}
	
	public Orders(int orderId,	Date date, String address, int price, Client client, List<Product> products){
		this.orderId = orderId;
		this.date = date;
		this.address=  address;
		this.price = price;
		this.client =  client;
		this.products = products;
	}
	
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
	
	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "order_detail", 
	joinColumns = @JoinColumn(name = "order_id",referencedColumnName = "order_id"), 
	inverseJoinColumns = @JoinColumn(name = "product_id",referencedColumnName = "product_id"))
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
