package com.example.customer.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.customer.model.Customers;


public interface CustomerRepository extends CrudRepository<Customers,String>{

}
