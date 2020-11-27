package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Material;
import com.project.shop_online.service.MaterialService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl implements MaterialService {

	@Override
	public List<Material> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Material findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Material material) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Material material) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}
}
