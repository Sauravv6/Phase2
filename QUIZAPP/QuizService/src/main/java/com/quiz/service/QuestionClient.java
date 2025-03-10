package com.quiz.service;

import com.quiz.bean.Question;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(url = "http://localhost:8082",value = "Question-Client")

@FeignClient(name = "QUESTION-SERVICE", path = "/question")
public interface QuestionClient {

    @GetMapping("/quiz/{quizId}")
    default List<Question> getQuestionOfQuiz(@PathVariable Long quizId) {
        List<Question> response = getQuestions(quizId);
        return response;
    }

    @GetMapping("/quiz/{quizId}")
    List<Question> getQuestions(@PathVariable Long quizId);
}
