package com.sping.redis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sping.redis.entity.Product;
import com.sping.redis.repository.ProductDao;

@RestController
@RequestMapping("product")
public class RedisController {
	
	@Autowired
	private ProductDao dao;
	
	@PostMapping
	public Product save(@RequestBody Product product) {
		return dao.save(product);
	}
	
	@GetMapping
	public List<Object> findAll(){
		return dao.findAll();
	}
	
	@GetMapping("/{id}")
	public Product findProductById(@PathVariable int id) {
		return dao.findProductById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteProductById(@PathVariable int id) {
		return dao.deleteProductById(id);
	} 
}
