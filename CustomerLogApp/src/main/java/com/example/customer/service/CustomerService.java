package com.example.customer.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customers;
import com.example.customer.repository.CustomerRepository;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customers> getAllCustomers()
	{
		List<Customers> customers=new ArrayList<Customers>();
		customerRepository.findAll().forEach(customers1 -> customers.add(customers1));
		return customers;
	}
	public Customers getCustomersById(String id)
	{
		return customerRepository.findById(id).get();
	}
	public void saveOrUpdate(Customers customers)
	{
		customerRepository.save(customers);
	}
	public void delete(String id)
	{
		customerRepository.deleteById(id);
	}
	public void update(Customers customers,String id)
	{
		customerRepository.save(customers);
	}

}
