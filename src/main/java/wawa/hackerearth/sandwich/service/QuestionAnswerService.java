package wawa.hackerearth.sandwich.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import wawa.hackerearth.sandwich.dao.QuestionAnswerDao;
import wawa.hackerearth.sandwich.model.entity.mappings.onetomapping.Answer;
import wawa.hackerearth.sandwich.model.entity.mappings.onetomapping.Question;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class QuestionAnswerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuestionAnswerService.class);
    @Autowired
    private QuestionAnswerDao questionAnswerDao;

    @PostConstruct
    public void init() {
        if (null == questionList() || CollectionUtils.isEmpty(questionList())) { // add ONLY IF QUESTION LIST is empty
            Answer ans1 = new Answer();
            ans1.setAnswerName("Java is a programming language");
            ans1.setPostedBy("Ravi Malik");

            Answer ans2 = new Answer();
            ans2.setAnswerName("Java is a platform");
            ans2.setPostedBy("Sudhir Kumar");

            Answer ans3 = new Answer();
            ans3.setAnswerName("Servlet is an Interface");
            ans3.setPostedBy("Jai Kumar");

            Answer ans4 = new Answer();
            ans4.setAnswerName("Servlet is an API");
            ans4.setPostedBy("Arun");

            ArrayList<Answer> list1 = new ArrayList<Answer>();
            list1.add(ans1);
            list1.add(ans2);

            ArrayList<Answer> list2 = new ArrayList<Answer>();
            list2.add(ans3);
            list2.add(ans4);

            Question question1 = new Question();
            question1.setQname("What is Java?");
            question1.setAnswers(list1);

            Question question2 = new Question();
            question2.setQname("What is Servlet?");
            question2.setAnswers(list2);

            List<Question> questions = Arrays.asList(question1, question2);// ADD questions

            questionAnswerDao.saveAll(questions);// save questions
        }
    }

    public List<Question> questionList() {
        List<Question> list = new ArrayList<>();
        try {
            list = questionAnswerDao.findAll();
        } catch (Exception e) {

            String msg = "Error while getting Data in QuestionAnswerService.questionList";
            LOGGER.error(msg, e);
        }
        return list;
    }

    public List<Answer> answerList() {
        List<Answer> list = new ArrayList<>();
        List<Question> questionList = questionList();
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

            String msg = "Error while getting Data in QuestionAnswerService.answerList";
            LOGGER.error(msg, e);
        }
        return list;
    }

}
