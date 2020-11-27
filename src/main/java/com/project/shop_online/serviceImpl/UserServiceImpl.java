package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Users;
import com.project.shop_online.service.UserService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}
}
