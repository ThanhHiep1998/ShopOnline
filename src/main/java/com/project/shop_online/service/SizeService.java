package com.project.shop_online.service;

import java.util.List;
import java.util.Locale.Category;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Size;

public interface SizeService {
	List<Size> findAll();
	Size findById(ObjectId id);
	void add(Size size);
	void update(Size size);
	void delete(ObjectId id);
}
