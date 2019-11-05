package wawa.hackerearth.sandwich.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.mappings.onetomapping.Question;

@Repository
public interface QuestionAnswerDao extends JpaRepository<Question, Long> {
}
