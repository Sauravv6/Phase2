package com.question.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.question.bean.Question;

import java.util.List;

public interface QuestionDAO extends JpaRepository<Question,Long> {

    List<Question> findByQuizId(Long quizId);
}
