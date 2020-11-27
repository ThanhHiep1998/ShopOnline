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

import com.project.shop_online.model.Discount;
import com.project.shop_online.service.DiscountService;

@RestController
@RequestMapping("api/discount")
public class ApiDiscountController {
	
	@Autowired
	private DiscountService discountService;
	
	@GetMapping("")
	public Object get() {
		List<Discount> discount = discountService.findAll();
		return new ResponseEntity<Object>(discount, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public Object get(@PathVariable("id") ObjectId id) {
		try {
			Discount discount = discountService.findById(id);
			return new ResponseEntity<Object>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<Object>("khong tim thay du lieu", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("")
	public Object post(@RequestBody Discount discount) {
		try {
			discountService.add(discount);
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object put(@RequestBody Discount discount) {
		try {
			discountService.update(discount);
			return new ResponseEntity<String>("cap nhat thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("cap nhat that bai", HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	public Object delete(@PathVariable("id") ObjectId id) {
		try {
			discountService.delete(id);
			return new ResponseEntity<String>("xoa thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("xoa that bai", HttpStatus.BAD_REQUEST);
		}
	}
}
