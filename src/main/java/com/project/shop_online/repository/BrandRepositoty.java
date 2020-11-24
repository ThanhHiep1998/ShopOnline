package com.project.shop_online.repository;

import com.project.shop_online.model.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepositoty extends MongoRepository<Brand, Long> {
}
