package wawa.hackerearth.sandwich.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wawa.hackerearth.sandwich.model.entity.mappings.onetomapping.Answer;
import wawa.hackerearth.sandwich.model.entity.mappings.onetomapping.Question;
import wawa.hackerearth.sandwich.service.QuestionAnswerService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@Api("Endpoint for QuestionAnswerController")
public class QuestionAnswerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionAnswerController.class);

    @Autowired
    private QuestionAnswerService questionAnswerService;

    @GetMapping(path = "/questions")
    public List<Question> questionList() {
        return questionAnswerService.questionList();
    }

    @GetMapping(path = "/answers")
    public List<Answer> answerList() {
        return questionAnswerService.answerList();
    }
}
