package com.project.shop_online.serviceImpl;

import com.project.shop_online.model.Size;
import com.project.shop_online.repository.SizeRepository;
import com.project.shop_online.service.SizeService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SizeServiceImpl implements SizeService {
    @Autowired
    private SizeRepository sizeRepository;

    @Override
    public List<Size> findAll() {
        // TODO Auto-generated method stub
        return sizeRepository.findAll();
    }

    @Override
    public Size findById(ObjectId id) {
        // TODO Auto-generated method stub
        return sizeRepository.findById(id).get();
    }

    @Override
    public void add(Size size) {
        // TODO Auto-generated method stub
        sizeRepository.save(size);

    }

    @Override
    public void update(Size size) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(ObjectId id) {
        // TODO Auto-generated method stub
        Optional<Size> size = sizeRepository.findById(id);
        sizeRepository.delete(size.get());
    }
}
