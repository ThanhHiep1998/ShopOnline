package com.project.shop_online.Repository;

import com.project.shop_online.Model.Orders;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepositoty extends MongoRepository<Orders, Long> {
}
