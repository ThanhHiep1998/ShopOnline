package com.project.shop_online.Repository;

import com.project.shop_online.Model.Brand;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepositoty extends MongoRepository<Brand, Long> {
}
