package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Images;

public interface ImagesService {
	List<Images> findAll();
	Images findById(ObjectId id);
	void add(Images Images);
	void update(Images images);
	void delete(ObjectId id);
}
