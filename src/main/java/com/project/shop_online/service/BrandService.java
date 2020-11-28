package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Brand;


public interface BrandService {
	List<Brand> findAll();
	Brand findById(ObjectId id);
	void add(Brand brand);
	void update(Brand brand);
	void delete(ObjectId id);
}
