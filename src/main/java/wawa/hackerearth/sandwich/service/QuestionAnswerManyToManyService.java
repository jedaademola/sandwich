package wawa.hackerearth.sandwich.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import wawa.hackerearth.sandwich.dao.QuestionAnswerDao;
import wawa.hackerearth.sandwich.dao.QuestionAnswerManyToManyDao;
import wawa.hackerearth.sandwich.model.entity.mappings.manytomany.AnswerManyToMany;
import wawa.hackerearth.sandwich.model.entity.mappings.manytomany.QuestionManyToMany;
import wawa.hackerearth.sandwich.model.entity.mappings.onetomapping.Answer;
import wawa.hackerearth.sandwich.model.entity.mappings.onetomapping.Question;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class QuestionAnswerManyToManyService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionAnswerManyToManyService.class);
    @Autowired
    private QuestionAnswerManyToManyDao questionAnswerManyToManyDao;

    @PostConstruct
    public void init() {
        if (null == questionList() || CollectionUtils.isEmpty(questionList())) { // add ONLY IF QUESTION LIST is empty
            AnswerManyToMany an1 = new AnswerManyToMany();
            an1.setAnswerName("Java is a programming language");
            an1.setPostedBy("Ravi Malik");

            AnswerManyToMany an2 = new AnswerManyToMany();
            an2.setAnswerName("Java is a platform");
            an2.setPostedBy("Sudhir Kumar");

            QuestionManyToMany q1 = new QuestionManyToMany();
            q1.setQname("What is Java?");
            ArrayList<AnswerManyToMany> l1 = new ArrayList<>();
            l1.add(an1);
            l1.add(an2);
            q1.setAnswers(l1);


            AnswerManyToMany ans3 = new AnswerManyToMany();
            ans3.setAnswerName("Servlet is an Interface");
            ans3.setPostedBy("Jai Kumar");

            AnswerManyToMany ans4 = new AnswerManyToMany();
            ans4.setAnswerName("Servlet is an API");
            ans4.setPostedBy("Arun");

            QuestionManyToMany q2 = new QuestionManyToMany();
            q2.setQname("What is Servlet?");
            ArrayList<AnswerManyToMany> l2 = new ArrayList<>();
            l2.add(ans3);
            l2.add(ans4);
            q2.setAnswers(l2);

            List<QuestionManyToMany> questions = Arrays.asList(q1, q2);// ADD questions

            questionAnswerManyToManyDao.saveAll(questions);// save questions
        }
    }

    public List<QuestionManyToMany> questionList() {
        List<QuestionManyToMany> list = new ArrayList<>();
        try {
            list = questionAnswerManyToManyDao.findAll();
        } catch (Exception e) {

            String msg = "Error while getting Data in QuestionAnswerManyToManyService.questionList";
            LOGGER.error(msg, e);
        }
        return list;
    }

    public List<AnswerManyToMany> answerList() {
        List<AnswerManyToMany> list = new ArrayList<>();
        List<QuestionManyToMany> questionList = questionList();
        try {
            /*list = questionList.stream()
            .map(question-> {
                 Answer ans = new Answer();
                ans.setAnswerName(question.getAnswers().stream().map(Answer::getAnswerName).toString());
                ans.setPostedBy(question.getAnswers().stream().map(Answer::getPostedBy).toString());
                return ans;
            })
           // .map(e -> new Answer(e.getAnswerName(), e.getPostedBy()))
            .collect(Collectors.toList());*/
            if (!CollectionUtils.isEmpty(questionList)) {
                questionList.forEach(q -> list.addAll(q.getAnswers()));
            }
        } catch (Exception e) {

            String msg = "Error while getting Data in QuestionAnswerManyToManyService.answerList";
            LOGGER.error(msg, e);
        }
        return list;
    }

}
