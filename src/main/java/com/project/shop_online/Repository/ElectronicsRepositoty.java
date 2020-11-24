package com.project.shop_online.Repository;

import com.project.shop_online.Model.Electronics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicsRepositoty extends MongoRepository<Electronics, Long> {
}
