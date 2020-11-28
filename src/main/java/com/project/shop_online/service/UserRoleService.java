package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.UserRole;

public interface UserRoleService {
	List<UserRole> findAll();
	UserRole findById(ObjectId id);
	void add(UserRole userRole );
	void update(UserRole userRole);
	void delete(ObjectId id);
}
