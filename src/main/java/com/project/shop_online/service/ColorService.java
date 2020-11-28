package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Color;

public interface ColorService {
	List<Color> findAll();
	Color findById(ObjectId id);
	void add(Color color);
	void update(Color color);
	void delete(ObjectId id);
}
