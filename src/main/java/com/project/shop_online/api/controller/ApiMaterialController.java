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

import com.project.shop_online.model.Material;
import com.project.shop_online.service.MaterialService;

@RestController
@RequestMapping("api/material")
public class ApiMaterialController {
	
	@Autowired
	private MaterialService materialService;
	
	@GetMapping("")
	public Object get() {
		List<Material> materials = materialService.findAll();
		return new ResponseEntity<Object>(materials, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public Object get(@PathVariable("id") ObjectId id) {
		try {
			Material material = materialService.findById(id);
			return new ResponseEntity<Object>(material, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Khong tim thay du lieu", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("")
	public Object post(@RequestBody Material material) {
		try {
			materialService.add(material);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object put(@RequestBody Material material) {
		try {
			materialService.update(material);
			return new ResponseEntity<String>("cap nhat thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("cap nhat that bai", HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	public Object delte(@PathVariable("id") ObjectId id) {
		try {
			materialService.delete(id);
			return new ResponseEntity<String>("xoa thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("xoa that bai", HttpStatus.BAD_REQUEST);
		}
	}
}
