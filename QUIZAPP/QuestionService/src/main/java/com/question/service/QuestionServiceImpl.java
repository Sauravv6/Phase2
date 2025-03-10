package com.question.service;


import org.springframework.stereotype.Service;

import com.question.bean.Question;
import com.question.dao.QuestionDAO;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionDAO questionDAO;

    public QuestionServiceImpl(QuestionDAO questionRepository) {
        this.questionDAO = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionDAO.save(question);
    }

    @Override
    public List<Question> get() {
        return questionDAO.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionDAO.findById(id).orElseThrow(() -> new RuntimeException("Question not found !!"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionDAO.findByQuizId(quizId);
    }
}
