package com.example.examserver.service;

import com.example.examserver.model.exam.Catagory;

import java.util.Set;

public interface CategoryService {
    public Catagory addCatagory(Catagory catagory);
    public Catagory updateCatagory(Catagory catagory);
    public Set<Catagory> getCatagories();
    public Catagory getCatagory(Long catagoryId);
    public void deleteCatagory(Long catagoryId);
}
