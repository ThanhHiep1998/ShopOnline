package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Electronics;
import com.project.shop_online.repository.ElectronicsRepository;
import com.project.shop_online.service.ElectonicsService;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectronicsServiceImpl implements ElectonicsService {

	@Autowired
	private ElectronicsRepository electronicRepository;
	
	@Override
	public List<Electronics> findAll() {
		// TODO Auto-generated method stub
		return electronicRepository.findAll();
	}

	@Override
	public Electronics findById(ObjectId id) {
		// TODO Auto-generated method stub
		return electronicRepository.findById(id).get();
	}

	@Override
	public void add(Electronics elec) {
		// TODO Auto-generated method stub
		electronicRepository.save(elec);
	}

	@Override
	public void update(Electronics elec) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		Optional<Electronics> elec = electronicRepository.findById(id);
		electronicRepository.delete(elec.get());
	}
}
