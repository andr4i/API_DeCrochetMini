package com.gen.DeCrochet.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUser")
	private long idUser;
	@Column(name="email",nullable=false)
	private String email;
	@Column(name="phoneNumber",nullable=false)
	private String phoneNumber;
	@Column(name="name",nullable=false)
	private String name;
	
//	@OneToMany(mappedBy="User")
//	private Address address;
//	
//	@OneToMany(mappedBy="User")
//	private Set<Order> userhasOrder;
	
	
//	public User() {
//		
//	}
//
//
//	public User(long idUsuario, String email, String phoneNumber, String name) {
//		super();
//		this.idUser = idUsuario;
//		this.email = email;
//		this.phoneNumber = phoneNumber;
//		this.name = name;
//	}


	public long getIdUsuario() {
		return idUser;
	}


	public void setIdUsuario(long idUsuario) {
		this.idUser = idUsuario;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
