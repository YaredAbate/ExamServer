package com.example.examserver.repo;


import com.example.examserver.model.exam.Catagory;
import com.example.examserver.model.exam.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
    public List<Quiz> findByCatagory(Catagory catagory);
    public List<Quiz> findByActive(Boolean b);
    public List<Quiz> findByCatagoryAndActive(Catagory catagory,Boolean b);
}
