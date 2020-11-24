package com.project.shop_online.Repository;

import com.project.shop_online.Model.Size;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepositoty extends MongoRepository<Size, Long> {
}
