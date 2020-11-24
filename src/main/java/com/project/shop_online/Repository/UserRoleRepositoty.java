package com.project.shop_online.Repository;

import com.project.shop_online.Model.UserRole;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepositoty extends MongoRepository<UserRole, Long> {
}
