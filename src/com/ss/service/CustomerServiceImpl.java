package com.ss.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ss.model.Customer;
import com.ss.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;

	@Autowired
	public CustomerServiceImpl(CustomerRepository cusrRepo) {
		System.out.println("Constructor injection");
		this.customerRepository = cusrRepo;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

//	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter injection");
		this.customerRepository = customerRepository;
	}

}
