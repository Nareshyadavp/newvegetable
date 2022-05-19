package com.vbmart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vwgetable_details")
public class Vegetable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long vegetableId;

	@Column(name="veg_name" , nullable = false)
	private String vegetableName;
	
	@Column(name="veg_price" , nullable = false)
	private double vegetablePrice;
	

	public Vegetable() {
		super();
		// TODO Auto-generated constructor stub
	}


	public long getVegetableId() {
		return vegetableId;
	}


	public void setVegetableId(long vegetableId) {
		this.vegetableId = vegetableId;
	}


	public String getVegetableName() {
		return vegetableName;
	}


	public void setVegetableName(String vegetableName) {
		this.vegetableName = vegetableName;
	}


	public double getVegetablePrice() {
		return vegetablePrice;
	}


	public void setVegetablePrice(double vegetablePrice) {
		this.vegetablePrice = vegetablePrice;
	}
	
	
	

}
