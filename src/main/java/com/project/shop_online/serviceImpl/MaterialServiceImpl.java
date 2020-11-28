package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Material;
import com.project.shop_online.repository.MaterialRepository;
import com.project.shop_online.service.MaterialService;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImpl implements MaterialService {

	@Autowired
	private MaterialRepository materialRepository;
	
	@Override
	public List<Material> findAll() {
		// TODO Auto-generated method stub
		return materialRepository.findAll();
	}

	@Override
	public Material findById(ObjectId id) {
		// TODO Auto-generated method stub
		return materialRepository.findById(id).get();
	}

	@Override
	public void add(Material material) {
		// TODO Auto-generated method stub
		materialRepository.save(material);
	}

	@Override
	public void update(Material material) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		Optional<Material> material = materialRepository.findById(id);
		materialRepository.delete(material.get());
	}
}
