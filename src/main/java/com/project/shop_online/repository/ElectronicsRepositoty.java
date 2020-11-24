package com.project.shop_online.repository;

import com.project.shop_online.model.Electronics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicsRepositoty extends MongoRepository<Electronics, Long> {
}
