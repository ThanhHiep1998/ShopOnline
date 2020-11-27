package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Electronics;
import com.project.shop_online.service.ElectonicsService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class ElectronicsServiceImpl implements ElectonicsService {

	@Override
	public List<Electronics> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Electronics findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Electronics elec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Electronics elec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}
}
