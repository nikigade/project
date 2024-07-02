package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Customer1Repository;
import com.model.Customer1;
import com.model.Product;

@Service
public class Customer1ServiceImpl  implements Customer1Service{

	
	@Autowired
	private Customer1Repository customerRepo;
	
	@Override
	public Customer1 addCustomer(Customer1 c) {
	
		return customerRepo.save(c);
	}
	@Override
	public List<Customer1> getAllCustomer()
	{
		
		return customerRepo.findAll();
	}

}