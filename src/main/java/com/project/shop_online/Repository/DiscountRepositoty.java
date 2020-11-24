package com.project.shop_online.Repository;

import com.project.shop_online.Model.Discount;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiscountRepositoty extends MongoRepository<Discount, Long> {
}
