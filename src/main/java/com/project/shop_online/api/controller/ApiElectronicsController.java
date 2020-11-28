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

import com.project.shop_online.model.Electronics;
import com.project.shop_online.service.ElectonicsService;

@RestController
@RequestMapping("api/electronic")
public class ApiElectronicsController {
	
	@Autowired
	private ElectonicsService electronicService;
	
	@GetMapping("")
	public Object get() {
		List<Electronics> electronics = electronicService.findAll();
		return new ResponseEntity<Object>(electronics, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public Object get(@PathVariable("id") ObjectId id) {
		try {
			Electronics electronics = electronicService.findById(id);
			return new ResponseEntity<Object>(electronics, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("khong tim thay du lieu", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("")
	public Object post(@RequestBody Electronics electronics) {
		try {
			electronicService.add(electronics);
			return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object put(@RequestBody Electronics electronics) {
		try {
			electronicService.update(electronics);
			return new ResponseEntity<String>("cap nhat thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("cap nhat that bai", HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	public Object delete(@PathVariable("id") ObjectId id) {
		try {
			electronicService.delete(id);
			return new ResponseEntity<String>("xoa thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("xoa that bai", HttpStatus.BAD_REQUEST);
		}
	}
}
