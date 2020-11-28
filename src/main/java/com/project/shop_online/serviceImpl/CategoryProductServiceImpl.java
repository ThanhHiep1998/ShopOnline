package com.project.shop_online.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.shop_online.model.CategoryProduct;
import com.project.shop_online.repository.CategoryProductRepository;
import com.project.shop_online.service.CategoryProductService;

@Service
public class CategoryProductServiceImpl implements CategoryProductService {

	@Autowired
	private CategoryProductRepository categoryRepository;
	
	@Override
	public List<CategoryProduct> findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public CategoryProduct findById(ObjectId id) {
		// TODO Auto-generated method stub
		return categoryRepository.findById(id).get();
	}

	@Override
	public void add(CategoryProduct categories) {
		// TODO Auto-generated method stub
		categoryRepository.save(categories);
	}

	@Override
	public void update(CategoryProduct categories) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		Optional<CategoryProduct> category = categoryRepository.findById(id);
		categoryRepository.delete(category.get());
	}

	

}
