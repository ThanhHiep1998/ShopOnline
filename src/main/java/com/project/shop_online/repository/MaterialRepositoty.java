package com.project.shop_online.repository;

import com.project.shop_online.model.Material;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepositoty extends MongoRepository<Material, ObjectId> {
}
