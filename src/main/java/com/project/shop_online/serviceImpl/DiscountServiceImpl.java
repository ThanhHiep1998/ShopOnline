package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Discount;
import com.project.shop_online.service.DiscountService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {

	@Override
	public List<Discount> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Discount findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Discount discount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Discount discount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}
}
