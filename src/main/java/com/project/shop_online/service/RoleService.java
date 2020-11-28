package com.project.shop_online.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.shop_online.model.Role;

public interface RoleService {
	List<Role> findAll();
	Role findById(ObjectId id);
	void add(Role role);
	void update(Role role);
	void delete(ObjectId id);
}
