package com.gen.DeCrochet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idAddress")
	private long idAddress;
	
	@Column(name="street",nullable=false)
	private String street;
	
	@Column(name="intNumber",nullable=false)
	private String intNumber;
	
	@Column(name="extNumber",nullable=false)
	private String extNumber;
	
	@Column(name="city",nullable=false)
	private String city;
	
	@Column(name="state",nullable=false)
	private String state;
	
	@Column(name="zipCode",nullable=false)
	private int zipCode;
	
	@Column(name="neighbourhood",nullable=false)
	private String neighbourhood;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="User_idUser",nullable=false)
//	private User user;
//	
//	public Address() {
//		
//	}
//
//	public Address(long idAddress, String street, String intNumber, String extNumber, String city, String state,
//			int zipCode, String neighbourhood, User user) {
//		super();
//		this.idAddress = idAddress;
//		this.street = street;
//		this.intNumber = intNumber;
//		this.extNumber = extNumber;
//		this.city = city;
//		this.state = state;
//		this.zipCode = zipCode;
//		this.neighbourhood = neighbourhood;
//		this.user = user;
//	}

	public long getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(long idAddress) {
		this.idAddress = idAddress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getIntNumber() {
		return intNumber;
	}

	public void setIntNumber(String intNumber) {
		this.intNumber = intNumber;
	}

	public String getExtNumber() {
		return extNumber;
	}

	public void setExtNumber(String extNumber) {
		this.extNumber = extNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getNeighbourhood() {
		return neighbourhood;
	}

	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
	
	
}
