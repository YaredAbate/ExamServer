package com.example.examserver.service;

import com.example.examserver.model.exam.Catagory;
import com.example.examserver.model.exam.Quiz;

import java.util.List;
import java.util.Set;

public interface QuizService {
    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Set<Quiz> getQuizzes();
    public Quiz getQuiz(Long quizId);
    public void deleteQuiz(Long quizId);
    public List<Quiz> getQuizzesOfCatagory(Catagory catagory);
    public List<Quiz> getActiveQuizzes();
    public List<Quiz> getActiveQuizzesOfCatagory(Catagory catagory);
}
