package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.UserRole;
import com.project.shop_online.repository.UserRoleRepository;
import com.project.shop_online.service.UserRoleService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAll() {
        // TODO Auto-generated method stub
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole findById(ObjectId id) {
        // TODO Auto-generated method stub
        return userRoleRepository.findById(id).get();
    }

    @Override
    public void add(UserRole userRole) {
        // TODO Auto-generated method stub
        userRoleRepository.save(userRole);
    }

    @Override
    public void update(UserRole userRole) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(ObjectId id) {
        // TODO Auto-generated method stub
        Optional<UserRole> userRole = userRoleRepository.findById(id);
        userRoleRepository.delete(userRole.get());
    }
}
