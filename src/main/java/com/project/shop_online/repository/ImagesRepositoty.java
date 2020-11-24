package com.project.shop_online.repository;

import com.project.shop_online.model.Images;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepositoty extends MongoRepository<Images, Long> {
}
