package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Electronics;

public interface ElectonicsService {
	List<Electronics> findAll();
	Electronics findById(ObjectId id);
	void add(Electronics elec);
	void update(Electronics elec);
	void delete(ObjectId id);
}
