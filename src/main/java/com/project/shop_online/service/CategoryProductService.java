package com.project.shop_online.service;

import java.util.List;
import java.util.Locale.Category;

import org.bson.types.ObjectId;

import com.project.shop_online.model.CategoryProduct;


public interface CategoryProductService {
	List<CategoryProduct> findAll();
	CategoryProduct findById(ObjectId id);
	void add(CategoryProduct categories);
	void update(CategoryProduct categories);
	void delete(ObjectId id);
}
