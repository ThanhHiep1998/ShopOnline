package com.project.shop_online.Repository;

import com.project.shop_online.Model.Images;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepositoty extends MongoRepository<Images, Long> {
}
