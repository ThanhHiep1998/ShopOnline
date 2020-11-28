package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Discount;

public interface DiscountService {
	List<Discount> findAll();
	Discount findById(ObjectId id);
	void add(Discount discount);
	void update(Discount discount);
	void delete(ObjectId id);
}
