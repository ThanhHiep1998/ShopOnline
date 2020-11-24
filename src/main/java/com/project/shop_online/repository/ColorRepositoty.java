package com.project.shop_online.repository;

import com.project.shop_online.model.Color;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepositoty extends MongoRepository<Color, Long> {
}
