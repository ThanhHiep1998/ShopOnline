package com.project.shop_online.repository;

import com.project.shop_online.model.CategoryProduct;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryProductRepositoty extends MongoRepository<CategoryProduct, Long> {
}
