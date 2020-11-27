package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Discount;
import com.project.shop_online.repository.DiscountRepository;
import com.project.shop_online.service.DiscountService;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountServiceImpl implements DiscountService {

	@Autowired
	private DiscountRepository discountRepository;
	
	@Override
	public List<Discount> findAll() {
		// TODO Auto-generated method stub
		return discountRepository.findAll();
	}

	@Override
	public Discount findById(ObjectId id) {
		// TODO Auto-generated method stub
		return discountRepository.findById(id).get();
	}

	@Override
	public void add(Discount discount) {
		// TODO Auto-generated method stub
		discountRepository.save(discount);
	}

	@Override
	public void update(Discount discount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		Optional<Discount> discount = discountRepository.findById(id);
		discountRepository.delete(discount.get());
	}
}
