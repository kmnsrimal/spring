package com.javatechie.crud.example.controller;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;





@RestController
public class ProductController {
	
	Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private  ProductService service;
	
	
	public class Home {
	    @RequestMapping("/")
	    public String getHomepage() {
	        return "home";
	    }
	    
	    
	}
	
	

	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		System.out.println("product");
   
		System.out.println("in product");
		return service.saveProduct(product);
	}  
	
	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products){
		return service.saveProducts(products);
	}
	
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	
	@GetMapping("/product/{id}")
	public Product findProductById(@PathVariable int id) {
		return service.getProductById(id);
	}
	
	@GetMapping("/product/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct( product);
	}  
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
	}  
	
	
}
