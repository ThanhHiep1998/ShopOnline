package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Brand;
import com.project.shop_online.service.BrandService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

	@Override
	public List<Brand> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Brand findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Brand brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Brand dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}
}
