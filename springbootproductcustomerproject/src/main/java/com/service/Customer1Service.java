package com.service;

import java.util.List;

import com.model.Customer1;

	public interface Customer1Service {

		Customer1 addCustomer(Customer1 c);
		
		public List<Customer1> getAllCustomer();
	}

