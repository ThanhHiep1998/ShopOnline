package com.project.shop_online.repository;

import com.project.shop_online.model.Size;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepositoty extends MongoRepository<Size, Long> {
}
