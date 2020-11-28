package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Material;

public interface MaterialService {
	List<Material> findAll();
	Material findById(ObjectId id);
	void add(Material material);
	void update(Material material);
	void delete(ObjectId id);
}
