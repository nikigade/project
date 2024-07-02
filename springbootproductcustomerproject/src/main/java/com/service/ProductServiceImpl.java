package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductRepository;
import com.model.Customer1;
import com.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepo;
	
	
	@Override
	public Product addProduct(Product p) {
		
		return productRepo.save(p) ;
	}


	@Override
	public Customer1 addCustomer1(Customer1 customer) {
		
		return null;
	}


	@Override
	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}

}