package com.Infraterials.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Infraterials.Entity.Customer;
import com.Infraterials.Repository.CustomerRepository;


@Service
public class CustomerService  {

	@Autowired
	private CustomerRepository customerRepo;

	
	public Customer addCustomer(Customer users) {
		return customerRepo.save(users);
	}
	

	
	public List<Customer> getAllCustomer() {
		return (List<Customer>) customerRepo.findAll();
		

	}

	
	public Customer login(String uname,String passwd) {
		return customerRepo.findByUserNameAndPassword(uname, passwd);
	}

}
