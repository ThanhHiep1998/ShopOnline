package com.project.shop_online.Repository;

import com.project.shop_online.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepositoty extends MongoRepository<Users, Long> {
}
