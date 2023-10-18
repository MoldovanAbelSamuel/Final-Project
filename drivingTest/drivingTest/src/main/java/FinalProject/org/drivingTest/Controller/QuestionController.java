package FinalProject.org.drivingTest.Controller;

import FinalProject.org.drivingTest.Model.Question;
import FinalProject.org.drivingTest.Model.Questionnaire;
import FinalProject.org.drivingTest.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("questions")
public class QuestionController {
    private QuestionService questionService;
    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public ResponseEntity<List<Question>> getQuestions() {
        List<Question> question = questionService.getQuestions();
        if (!question.isEmpty()) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @PostMapping
    public ResponseEntity<Question> addQuestion(@RequestBody Question question){
        Question addedQuestion = questionService.addQuestion(question);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedQuestion);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Question>> getQuestion(@PathVariable int id){
        Optional<Question> question = questionService.getQuestion(id);
        if (question.isPresent()) {
            return ResponseEntity.ok(question);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }
}
