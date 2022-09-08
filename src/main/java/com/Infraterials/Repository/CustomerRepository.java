package com.Infraterials.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Infraterials.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	
	Customer findByUserNameAndPassword(String userName,String password );
}

