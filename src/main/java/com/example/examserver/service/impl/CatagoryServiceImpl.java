package com.example.examserver.service.impl;

import com.example.examserver.model.exam.Catagory;
import com.example.examserver.repo.CatagoryRepository;
import com.example.examserver.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class CatagoryServiceImpl implements CategoryService {
    @Autowired
    private CatagoryRepository catagoryRepository;
    @Override
    public Catagory addCatagory(Catagory catagory) {
        return this.catagoryRepository.save(catagory);
    }

    @Override
    public Catagory updateCatagory(Catagory catagory) {
        return this.catagoryRepository.save(catagory);
    }

    @Override
    public Set<Catagory> getCatagories() {
        return new LinkedHashSet<>(this.catagoryRepository.findAll());
    }

    @Override
    public Catagory getCatagory(Long catagoryId) {
        return this.catagoryRepository.findById(catagoryId).get();
    }

    @Override
    public void deleteCatagory(Long catagoryId) {
        Catagory catagory=new Catagory();
        catagory.setCId(catagoryId);
        this.catagoryRepository.delete(catagory);
    }
}
