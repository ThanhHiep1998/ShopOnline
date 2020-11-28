package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Orders;
import com.project.shop_online.repository.OrdersRepository;
import com.project.shop_online.service.OrdersService;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	private OrdersRepository ordersRepository;
	
	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return ordersRepository.findAll();
	}

	@Override
	public Orders findById(ObjectId id) {
		// TODO Auto-generated method stub
		return ordersRepository.findById(id).get();
	}

	@Override
	public void add(Orders orders) {
		// TODO Auto-generated method stub
		ordersRepository.save(orders);
	}

	@Override
	public void update(Orders oders) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		Optional<Orders> orders = ordersRepository.findById(id);
		ordersRepository.delete(orders.get());
	}
}
