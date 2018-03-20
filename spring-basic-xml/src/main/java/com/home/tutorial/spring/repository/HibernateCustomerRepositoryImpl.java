package com.home.tutorial.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.home.tutorial.spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customerList=new ArrayList<Customer>();
		
		Customer customer=new Customer();
		customer.setFirstName("Prabuddha");
		customer.setLastName("Basu");
		
		customerList.add(customer);
		
		return customerList;
	}
}