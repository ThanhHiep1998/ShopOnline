package com.project.shop_online.serviceImpl;


import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import com.project.shop_online.model.Product;
import com.project.shop_online.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}

}
