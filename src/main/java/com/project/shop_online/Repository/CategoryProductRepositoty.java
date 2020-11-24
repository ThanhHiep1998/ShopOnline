package com.project.shop_online.Repository;

import com.project.shop_online.Model.CategoryProduct;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryProductRepositoty extends MongoRepository<CategoryProduct, Long> {
}
