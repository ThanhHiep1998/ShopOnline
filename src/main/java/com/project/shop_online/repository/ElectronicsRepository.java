package com.project.shop_online.repository;

import com.project.shop_online.model.Electronics;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicsRepository extends MongoRepository<Electronics, ObjectId> {
}
