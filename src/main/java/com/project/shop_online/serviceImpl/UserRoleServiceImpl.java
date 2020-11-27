package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.UserRole;
import com.project.shop_online.service.UserRoleService;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl  implements UserRoleService {

	@Override
	public List<UserRole> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRole findById(ObjectId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(UserRole userRole) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(UserRole userRole) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ObjectId id) {
		// TODO Auto-generated method stub
		
	}
}
