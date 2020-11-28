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

import com.project.shop_online.model.Images;
import com.project.shop_online.service.ImagesService;

@RestController
@RequestMapping("api/img")
public class ApiImagesController {
	
	@Autowired
	private ImagesService imagesService;
	
	@GetMapping("")
	public Object get() {
		List<Images> images = imagesService.findAll();
		return new ResponseEntity<Object>(images, HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public Object get(@PathVariable("id") ObjectId id) {
		try {
			Images images = imagesService.findById(id);
			return new ResponseEntity<Object>(images, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Khong tim thay du lieu", HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("")
	public Object post(@RequestBody Images images) {
		try {
			imagesService.add(images);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("")
	public Object put(@RequestBody Images images) {
		try {
			imagesService.update(images);
			return new ResponseEntity<String>("Cap nhat thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Cap nhat that bai", HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping("/{id}")
	public Object delete(@PathVariable("id") ObjectId id) {
		try {
			imagesService.delete(id);
			return new ResponseEntity<String>("Xoa thanh cong", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Xoa that bai", HttpStatus.BAD_REQUEST);
		}
	}
	
}
