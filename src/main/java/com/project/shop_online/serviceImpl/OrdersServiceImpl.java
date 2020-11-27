package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Orders;
import com.project.shop_online.service.OrdersService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Orders orders) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Orders oders) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}
}
