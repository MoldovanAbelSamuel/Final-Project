package FinalProject.org.drivingTest.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerId;

    private String text;

    @OneToMany(mappedBy = "answer", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<QuestionAnswer> questionAnswers;

    public Answer(String text) {
        this.text = text;
    }

    public Answer(int answerId, String text, List<QuestionAnswer> questionAnswers) {
        this.answerId = answerId;
        this.text = text;
        this.questionAnswers = questionAnswers;
    }

    public Answer(String text, List<QuestionAnswer> questionAnswers) {
        this.text = text;
        this.questionAnswers = questionAnswers;
    }

    public Answer() {
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<QuestionAnswer> getQuestionAnswers() {
        return questionAnswers;
    }

    public void setQuestionAnswers(List<QuestionAnswer> questionAnswers) {
        this.questionAnswers = questionAnswers;
    }
}
