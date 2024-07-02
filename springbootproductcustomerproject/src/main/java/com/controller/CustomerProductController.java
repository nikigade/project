package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.Customer1;
import com.model.Product;
import com.service.Customer1Service;
import com.service.ProductService;

@Controller
public class CustomerProductController 
{

	@Autowired
	private ProductService productService;
	
	@Autowired
	private Customer1Service  customer1Service;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<Product> addProduct (@RequestBody Product p)
	{
		Product product=productService.addProduct(p);
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "addproduct").body(product);
	}
	@GetMapping("/getAll")
	public List<Product> getAllProduct()
	{
		return productService.getAllProduct();
	}
	
	
	@PostMapping("/saveCustomer")
	
	public ResponseEntity<Customer1> addCustomer(@RequestBody Customer1 c) {
	
			Customer1 customer=	customer1Service.addCustomer(c);
		
		return ResponseEntity.status(HttpStatus.CREATED).header("add", "add customer1").body(customer);
	}
	@GetMapping("/getAllCustomer")
	public List<Customer1> getAllCustomer()
	{
		return customer1Service.getAllCustomer();
	}
}
