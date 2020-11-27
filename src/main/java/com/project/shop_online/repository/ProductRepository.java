package com.project.shop_online.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.shop_online.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, ObjectId> {

}
