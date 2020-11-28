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

import com.project.shop_online.model.Orders;
import com.project.shop_online.service.OrdersService;

@RestController
@RequestMapping("api/order")
public class ApiOrdersController {

	@Autowired
	private OrdersService orderService;

	@GetMapping("")
	public Object get() {
		List<Orders> order = orderService.findAll();
		return new ResponseEntity<Object>(order, HttpStatus.OK);
	}

	@GetMapping("{id}")
	public Object get(@PathVariable("id") ObjectId id) {
		try {
			Orders orders = orderService.findById(id);
			return new ResponseEntity<Object>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("khong tim thay du lieu", HttpStatus.BAD_REQUEST);
		}
	}

	@PostMapping("")
	public Object post(@RequestBody Orders orders) {
		try {
			orderService.add(orders);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object put(@RequestBody Orders orders) {
		try {
			orderService.update(orders);
			return new ResponseEntity<String>("Cap nhat thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Cap nhat that bai", HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	public Object delete(@PathVariable("id") ObjectId id) {
		try {
			orderService.delete(id);
			return new ResponseEntity<String>("Xoa thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Xoa that bai", HttpStatus.BAD_REQUEST);
		}
	}
}
