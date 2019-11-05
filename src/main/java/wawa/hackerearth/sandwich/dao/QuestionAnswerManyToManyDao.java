package wawa.hackerearth.sandwich.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wawa.hackerearth.sandwich.model.entity.mappings.manytomany.QuestionManyToMany;

@Repository
public interface QuestionAnswerManyToManyDao extends JpaRepository<QuestionManyToMany, Long> {
}
