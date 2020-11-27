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
import org.springframework.web.bind.annotation.RestController;

import com.project.shop_online.model.Brand;
import com.project.shop_online.model.Product;
import com.project.shop_online.model.Users;
import com.project.shop_online.service.UserService;

@RestController
public class ApiUserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public Object get() {
		List<Users> users = userService.findAll();
		return new ResponseEntity<Object>(users,HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public Object get(@PathVariable("id") ObjectId id){
		try {
			Users users = userService.findById(id);
			return new ResponseEntity<Object>(users, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<Object>("khong tim thay dulieu", HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping("")
	public Object post(@RequestBody Users users) {
		
		try {
			userService.add(users);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object put(@RequestBody Users users) {
		try {
			userService.update(users);
			return new ResponseEntity<String>("Cap nhat thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Cap nhat that bai", HttpStatus.BAD_REQUEST);
		}
	}
	
}
