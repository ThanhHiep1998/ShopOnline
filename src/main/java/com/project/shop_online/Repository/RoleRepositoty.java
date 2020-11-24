package com.project.shop_online.Repository;

import com.project.shop_online.Model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositoty extends MongoRepository<Role, Long> {
}
