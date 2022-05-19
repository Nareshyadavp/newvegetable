package com.vbmart.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.vbmart.dto.CustomerDTO;
import com.vbmart.exception.BadRequestException;
import com.vbmart.model.Customer;
import com.vbmart.repository.CustomerRepository;
import com.vbmart.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	public CustomerRepository customerRepository;

	@Override
	@Transactional
	public CustomerDTO saveCustomerDetails(CustomerDTO customerDTO) throws BadRequestException {
		Customer customer = modelMapper.map(customerDTO, Customer.class);
		customer = customerRepository.save(customer);
		return modelMapper.map(customer, CustomerDTO.class);
	}

	@Override
	public CustomerDTO getSaveCustomer(long customerId) throws BadRequestException {
		CustomerDTO customerDTO = null;
		Customer customer = customerRepository.findByCustomerId(customerId);
		if (customer != null) {
			customerDTO = modelMapper.map(customer, CustomerDTO.class);
		}
		return customerDTO;
	}

	@Override
	public CustomerDTO getCustomerName(String customerName) throws BadRequestException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> searchCustomer(String query) throws BadRequestException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getPaginationCustomer(int pageNo, int pageSize) {
		Pageable pagination = PageRequest.of(pageNo, pageSize);
		Page<Customer> pagedResult = customerRepository.findAll(pagination);
		if (pagedResult.hasContent()) {
			return pagedResult.getContent();
		} else {

			return new ArrayList<Customer>();

		}
	}

	@Override
	public List<CustomerDTO> getAll() {
		List<CustomerDTO> customerDTOs = new ArrayList<>();
		List<Customer> customers = (List<Customer>) customerRepository.findAll();
		for (Customer customer : customers) {
			CustomerDTO customerDTO = modelMapper.map(customer, CustomerDTO.class);
			customerDTOs.add(customerDTO);
		}
		return customerDTOs;
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDTO) throws BadRequestException {
		Customer customer = modelMapper.map(customerDTO, Customer.class);
		customer = customerRepository.save(customer);

		return modelMapper.map(customer, CustomerDTO.class);
	}

	@Override
	public CustomerDTO deleteCustomer(long customeId, CustomerDTO customerDTO) throws BadRequestException {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public CustomerDTO deleteCustomer(long customeId) throws BadRequestException {
//		//Customer customer=modelMapper.map(customerDTO,Customer.class);
//		customerRepository.save(customer);
//		return modelMapper.map(customer, CustomerDTO.class);
//	}
	
	
//	public void deleteCustomer(long customerId) {
//	Customer dbcustomer=getByCustomerId(customerId);
//	if(dbcustomer!=null) {
//	customerRepository.deleteById(customerId);
//	
//	}
//
//
//}
//
//	private Customer getByCustomerId(long customerId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public CustomerDTO deleteCustomer(long customeId, CustomerDTO customerDTO) throws BadRequestException {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
