package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Role;
import com.project.shop_online.repository.RoleRepository;
import com.project.shop_online.service.RoleService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        // TODO Auto-generated method stub
        return roleRepository.findAll();
    }

    @Override
    public Role findById(ObjectId id) {
        // TODO Auto-generated method stub
        return roleRepository.findById(id).get();
    }

    @Override
    public void add(Role role) {
        // TODO Auto-generated method stub
        roleRepository.save(role);

    }

    @Override
    public void update(Role role) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(ObjectId id) {
        // TODO Auto-generated method stub
        Optional<Role> brand = roleRepository.findById(id);
        roleRepository.delete(brand.get());

    }
}
