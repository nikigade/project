package com.service;


import java.util.List;

import com.model.Customer1;
import com.model.Product;


public interface ProductService {
	
	public Product addProduct(Product p);
	
	public Customer1 addCustomer1(Customer1 customer);
	
	public List<Product> getAllProduct();

}