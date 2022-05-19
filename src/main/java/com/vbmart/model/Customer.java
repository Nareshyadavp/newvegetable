package com.vbmart.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer_details")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long customerId;

	@Column(name = "cus_password", nullable = false)
	private String customerPassword;

	@Column(name = "cus_name", nullable = false)
	private String customerName;

	@Column(name = "cus_mobile", nullable = false)
	private long customerMobile;

	@Column(name = "cus_address", nullable = false)
	private String customerAddress;

	@Column(name = "cus_email", nullable = false)
	@Email
	private String customerEmail;
	
	 //@OneToMany(mappedBy = "customer", orphanRemoval = true, cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	// @JsonIgnore
	// private List<StoreCard> storeCards;
}
