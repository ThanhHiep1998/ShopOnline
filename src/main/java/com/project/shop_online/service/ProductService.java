package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Product;

public interface ProductService {
	List<Product> findAll();
	Product findById(ObjectId id);
	void add(Product product);
	void update(Product product);
	void delete(ObjectId id);
}
