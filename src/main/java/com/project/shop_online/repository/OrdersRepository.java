package com.project.shop_online.repository;

import com.project.shop_online.model.Orders;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends MongoRepository<Orders, ObjectId> {
}
