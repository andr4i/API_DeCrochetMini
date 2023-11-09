package com.gen.DeCrochet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product")


public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProduct")
	private long idProduct;
	
	@Column(name="nameModel",nullable=false)
	private String nameModel;
	
	@Column(name="image",nullable=false)
	private String image;
	
	@Column(name="description",nullable=false)
	private String description;
	
	@Column(name="stock",nullable=false)
	private int stock;
	
	@Column(name="category",nullable=false)
	private String category;
	
	@Column(name="price",nullable=false)
	private double price;
	
//	@OneToMany(mappedBy="User")
//	private Set<OrderProduct> orderDetailsProduct;
//	
	public Product() {
		
	}
	
//	public Product(String nameModel, String image, int description, int stock, String category) {
//		super();
//		this.nameModel = nameModel;
//		this.image = image;
//		this.description = description;
//		this.stock = stock;
//		this.category = category;
//	}
//	
//
//	public Product(long idProduct, String nameModel, String image, int description, int stock, String category) {
//		super();
//		this.idProduct = idProduct;
//		this.nameModel = nameModel;
//		this.image = image;
//		this.description = description;
//		this.stock = stock;
//		this.category = category;
//	}

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameModel() {
		return nameModel;
	}

	public void setNameModel(String nameModel) {
		this.nameModel = nameModel;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

//	public Set<OrderProduct> getOrderDetailsProduct() {
//		return orderDetailsProduct;
//	}
//
//	public void setOrderDetailsProduct(Set<OrderProduct> orderDetailsProduct) {
//		this.orderDetailsProduct = orderDetailsProduct;
//	}
	
	
	
}
