package FinalProject.org.drivingTest.Service;

import FinalProject.org.drivingTest.Model.Question;
import FinalProject.org.drivingTest.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    public QuestionRepository questionRepository;

    @Autowired
    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getQuestions(){
        return this.questionRepository.findAll();
    }

    public Question addQuestion(Question question){
        return this.questionRepository.save(question);
    }

    public Optional<Question> getQuestion(int id) {
        return this.questionRepository.findById(id);
    }
}
