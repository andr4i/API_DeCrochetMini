package com.gen.DeCrochet.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Orden")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idOrder")
	private long idOrder;
	
	@Column(name="date",nullable=false)
	private String date;
	
	@Column(name="status",nullable=false)
	private String status;

	@Column(name="total",nullable=false)
	private int total;
	
//	@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name="User_idUser",nullable=false)
//	private User user;
//	
//	@OneToMany(mappedBy="User")
//	private Set<OrderProduct> orderHasDetails;
	
	
}
