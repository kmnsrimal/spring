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
		System.out.println(id);
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
		System.out.println(id);
	}
	public String getName() {
		// TODO Auto-generated method stub
		System.out.println(name);
		return name;
	}
	public void setName(String name){
		// TODO Auto-generated method stub
		this.name = name;
		System.out.println(name);
	}
	public int getQuentity() {
		// TODO Auto-generated method stub
		System.out.println(quentity);
		return quentity;
	}
	public void setQuantity(int quentity) {
		// TODO Auto-generated method stub
		this.quentity = quentity;
		System.out.println(quentity);
	}
	public Double getPrice() {
		// TODO Auto-generated method stub
		System.out.println(price);
		return price;
	}
	public void setPrice(Double price) {
		// TODO Auto-generated method stub
		this.price = price;
		System.out.println(price);
	}
	public void addAttribute(String string, List<Product> listProducts) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
