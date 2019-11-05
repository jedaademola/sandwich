package wawa.hackerearth.sandwich.model.entity.mappings.manytomany;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "questionManyToMany")
public class QuestionManyToMany implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String qname;

    @ManyToMany(targetEntity = AnswerManyToMany.class, cascade = {CascadeType.ALL})
    @JoinTable(name = "question_answer", joinColumns = {@JoinColumn(name = "q_id")},
            inverseJoinColumns = {@JoinColumn(name = "ans_id")})
    private List<AnswerManyToMany> answers;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public List<AnswerManyToMany> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerManyToMany> answers) {
        this.answers = answers;
    }
}
