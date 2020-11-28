package com.project.shop_online.serviceImpl;


import com.project.shop_online.model.Product;
import com.project.shop_online.repository.ProductRepository;
import com.project.shop_online.service.ProductService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        // TODO Auto-generated method stub
        return productRepository.findAll();
    }

    @Override
    public Product findById(ObjectId id) {
        // TODO Auto-generated method stub
        return productRepository.findById(id).get();
    }

    @Override
    public void add(Product brand) {

        productRepository.save(brand);
    }

    @Override
    public void update(Product brand) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(ObjectId id) {
        // TODO Auto-generated method stub
        Optional<Product> product = productRepository.findById(id);
        productRepository.delete(product.get());
    }

}
