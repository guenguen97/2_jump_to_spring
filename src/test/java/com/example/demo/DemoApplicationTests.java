package com.example.demo;

import com.example.demo.Answer.Answer;
import com.example.demo.Answer.AnswerRepository;
import com.example.demo.Question.Question;
import com.example.demo.Question.QuestionRepository;
import com.example.demo.Question.QuestionService;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {


	@Autowired
	private QuestionRepository questionRepository;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private AnswerRepository answerRepository;



	@Test
	void testJpa() {
		for (int i = 0; i < 300; i++) {
			String subject=String.format("테스트 데이터 입니다. [%03d]",i);
			String content ="내용 무";

			this.questionService.create(subject,content,null);
		}


	}

}
