package com.project.shop_online.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.shop_online.Model.Product;

@Repository 
public interface ProductRepositoty  extends MongoRepository<Product, ObjectId>{

}
