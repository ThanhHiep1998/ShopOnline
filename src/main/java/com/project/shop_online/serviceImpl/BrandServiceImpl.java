package com.project.shop_online.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shop_online.model.Brand;
import com.project.shop_online.repository.BrandRepository;
import com.project.shop_online.service.BrandService;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public List<Brand> findAll() {
		// TODO Auto-generated method stub
		return brandRepository.findAll();
	}

	@Override
	public Brand findById(ObjectId id) {
		// TODO Auto-generated method stub
		return brandRepository.findById(id).get();
	}

	@Override
	public void add(Brand brand) {
		brandRepository.save(brand);
	}

	@Override
	public void update(Brand brand) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		Optional<Brand> brand = brandRepository.findById(id);
		brandRepository.delete(brand.get());
	}
}
