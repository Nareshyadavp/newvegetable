package com.vbmart.dto;

import javax.persistence.Column;

public class VegetableDTO {
	
	private long vegetableId;

	
	private String vegetableName;
	
	private double vegetablePrice;

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
