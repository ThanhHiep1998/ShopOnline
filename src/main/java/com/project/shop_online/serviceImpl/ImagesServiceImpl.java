package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Images;
import com.project.shop_online.repository.ImagesRepository;
import com.project.shop_online.service.ImagesService;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImagesServiceImpl implements ImagesService {

	@Autowired
	private ImagesRepository imagesRepository;
	
	@Override
	public List<Images> findAll() {
		// TODO Auto-generated method stub
		return imagesRepository.findAll();
	}

	@Override
	public Images findById(ObjectId id) {
		// TODO Auto-generated method stub
		return imagesRepository.findById(id).get();
	}

	@Override
	public void add(Images images) {
		// TODO Auto-generated method stub
		imagesRepository.save(images);
	}

	@Override
	public void update(Images Images) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		Optional<Images> images = imagesRepository.findById(id);
		imagesRepository.delete(images.get());
	}
}
