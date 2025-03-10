package com.quiz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.quiz.bean.Quiz;

public interface QuizDAO extends JpaRepository<Quiz,Long> {
	
	
}
