package com.project.shop_online.repository;

import com.project.shop_online.model.Discount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepositoty extends MongoRepository<Discount, Long> {
}
