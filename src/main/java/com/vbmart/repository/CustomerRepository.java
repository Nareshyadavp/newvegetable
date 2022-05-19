package com.vbmart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.vbmart.dto.CustomerDTO;
import com.vbmart.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer save(CustomerDTO customerDto);
	Customer findByCustomerId(long customerId);
	Customer findByCustomerName(String customerName);
	
	
	
	@Query("SELECT r FROM Customer r WHERE r.customerName LIKE %?1%")

	List<Customer> searchCustomer(String query);

}
