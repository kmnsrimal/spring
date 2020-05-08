package com.javatechie.crud.example.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT_TBL")
public class Product {
    
//	Logger logger = LoggerFactory.getLogger(Product.class);
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quentity;
	private double price;
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public Object getQuentity() {
		// TODO Auto-generated method stub
		return quentity;
	}
	public void setQuantity(Object quentity2) {
		// TODO Auto-generated method stub
		
	}
	public Object getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		
	}
	public void addAttribute(String string, List<Product> listProducts) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
