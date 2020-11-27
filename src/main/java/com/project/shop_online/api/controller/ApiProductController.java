package com.project.shop_online.api.controller;


import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.shop_online.model.Product;
import com.project.shop_online.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ApiProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public Object get() {
		List<Product> product = productService.findAll();
		return new ResponseEntity<Object>(product, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public Object get(@PathVariable("id") ObjectId id) {
		try {
			Product product = productService.findById(id);
			return new ResponseEntity<Object>(product, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Khong tim thay du lieu", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("")
	public Object post(@RequestBody Product product) {
		try {
			productService.add(product);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object put(@RequestBody Product product) {
		try {
			productService.update(product);
			return new ResponseEntity<String>("Cap nhat that bai", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Cap nhat thanh cong", HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	public Object delete(@PathVariable("id") ObjectId id) {
		try {
			productService.delete(id);
			return new ResponseEntity<String>("xoa thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("xoa that bai", HttpStatus.BAD_REQUEST);
		}
	}
}
