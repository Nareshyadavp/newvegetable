package com.vbmart.model;

 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
  
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="vcartvegetables_details")
public class VcartVegetables {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cartVegId")
	private long cartVegId;

	private String vCardName;
	@Column(name = "quantity")
	private int quantity;

//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "cartid")
//	@JsonIgnore
//	private FoodCart foodCart;
//
//	

//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//	@JoinColumn(name = "itemid")
//	@JsonIgnore

	// Items items1;
	
//	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
//	@JoinColumn(name = "restaurantId")
//	@JsonIgnore
//
//	private Restaurant  restaurant;
//

//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name = "customerId")
//	@JsonIgnore
//	private Customer customer;
}
