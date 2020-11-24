package com.project.shop_online.Repository;

import com.project.shop_online.Model.Color;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepositoty extends MongoRepository<Color, Long> {
}
