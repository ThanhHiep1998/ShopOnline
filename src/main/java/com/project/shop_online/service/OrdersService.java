package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Orders;

public interface OrdersService {
	List<Orders> findAll();
	Orders findById(ObjectId id);
	void add(Orders orders);
	void update(Orders oders);
	void delete(ObjectId id);
}
