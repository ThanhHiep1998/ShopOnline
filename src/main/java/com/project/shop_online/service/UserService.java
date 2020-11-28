package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Users;

public interface UserService {
	List<Users> findAll();
	Users findById(ObjectId id);
	void add(Users users);
	void update(Users users);
	void delete(ObjectId id);
}
