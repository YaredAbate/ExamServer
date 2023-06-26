package com.example.examserver.repo;

import com.example.examserver.model.exam.Catagory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatagoryRepository extends JpaRepository<Catagory,Long> {


}
