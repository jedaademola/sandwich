package wawa.hackerearth.sandwich.controller;

import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wawa.hackerearth.sandwich.model.entity.mappings.manytomany.AnswerManyToMany;
import wawa.hackerearth.sandwich.model.entity.mappings.manytomany.QuestionManyToMany;
import wawa.hackerearth.sandwich.service.QuestionAnswerManyToManyService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
@Api("Endpoint for QuestionAnswerManyToManyController")
public class QuestionAnswerManyToManyController {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionAnswerManyToManyController.class);

    @Autowired
    private QuestionAnswerManyToManyService questionAnswerManyToManyService;

    @GetMapping(path = "/mquestions")
    public List<QuestionManyToMany> questionList() {
        return questionAnswerManyToManyService.questionList();
    }

    @GetMapping(path = "/manswers")
    public List<AnswerManyToMany> answerList() {
        return questionAnswerManyToManyService.answerList();
    }
}
