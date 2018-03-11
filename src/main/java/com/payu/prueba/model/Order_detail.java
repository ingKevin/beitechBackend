package com.payu.prueba.model;


import javax.persistence.*;

@Entity
public class Order_detail {

	private int id;
	private Product product;
	private Orders order;
	
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
	@JoinColumn(name="order_id")
	public Orders getOrder() {
		return order;
	}
	
	public void setOrder(Orders order) {
		this.order = order;
	}
	
	
	
}
