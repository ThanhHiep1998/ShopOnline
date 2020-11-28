package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.UserRole;
import com.project.shop_online.model.Users;
import com.project.shop_online.repository.UsersRepository;
import com.project.shop_online.service.UserService;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> findAll() {
        // TODO Auto-generated method stub
        return usersRepository.findAll();
    }

    @Override
    public Users findById(ObjectId id) {
        // TODO Auto-generated method stub
        return usersRepository.findById(id).get();
    }

    @Override
    public void add(Users users) {
        // TODO Auto-generated method stub

    }

    @Override
    public void update(Users users) {
        // TODO Auto-generated method stub
        usersRepository.save(users);

    }

    @Override
    public void delete(ObjectId id) {
        // TODO Auto-generated method stub
        Optional<Users> users = usersRepository.findById(id);
        usersRepository.delete(users.get());

    }
}
