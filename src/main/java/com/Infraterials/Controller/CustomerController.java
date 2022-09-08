package com.Infraterials.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Infraterials.Entity.Customer;
import com.Infraterials.Services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	
	
//	DONE
	@PostMapping("/add")
	public String addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
		return "User add sucessfully....";
	}
	
	
//	DONE
//	@GetMapping("/login/{uname}/{passwd}")
//	public Customer loging(@PathVariable String uname,@PathVariable String passwd) {
//		return customerService.login(uname, passwd);
//	}
//	
	@RequestMapping("/login")
	@PostMapping
	public String login(@RequestBody String[]a) {
		String unameString=a[0];
		String passwd=a[1];
		Customer obj = customerService.login(unameString,passwd);
		if(obj!=null) {
			 return "User Found....";
		}else {
			 return "User not Found....";
		}
		
	}

}
