package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.model.Customers;
import com.example.customer.service.CustomerService;

@RestController
public class CustomerController 
{
    @Autowired
    CustomerService customerService;

    @GetMapping("/customer")
   private List<Customers> getAllCustomers()
   {
	   return customerService.getAllCustomers();
   }

   @GetMapping("/customer/{id}")
   private Customers getCustomers(@PathVariable("id") String id) 
   {
	  return customerService.getCustomersById(id);
   }

   @DeleteMapping("/customer/{id}")
   private String deleteCustomer(@PathVariable("id") String id)
   {
	  customerService.delete(id);
	  return"deleted Successfully";
   }

   @PostMapping("/customer")
   private String saveCustomer(@RequestBody Customers customers) 
   {
	   customerService.saveOrUpdate(customers);
	   return customers.getId();
   }

   @PutMapping("/customer")
   private Customers update(@RequestBody Customers customers)
   {
	    customerService.saveOrUpdate(customers);
	    return customers;
    }
}
