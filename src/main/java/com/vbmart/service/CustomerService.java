package com.vbmart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vbmart.dto.CustomerDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Customer;

@Service
public interface CustomerService {
	CustomerDTO saveCustomerDetails(CustomerDTO customerDTO) throws BadRequestException;
	CustomerDTO getSaveCustomer(long customerId) throws BadRequestException;
	CustomerDTO getCustomerName(String customerName) throws BadRequestException;
	List<Customer> searchCustomer(String query) throws BadRequestException;
	CustomerDTO updateCustomer(CustomerDTO customerDTO) throws BadRequestException;
	//CustomerDTO deleteCustomer(long customerId) throws BadRequestException;
	List<Customer> getPaginationCustomer(int pageNo, int pageSize);
	List<CustomerDTO> getAll();
	CustomerDTO deleteCustomer(long customeId, CustomerDTO customerDTO) throws BadRequestException;
	

}
