package FinalProject.org.drivingTest.Service;

import FinalProject.org.drivingTest.Model.Questionnaire;
import FinalProject.org.drivingTest.Repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionnaireService {

    private QuestionnaireRepository questionnaireRepository;

    @Autowired
    public QuestionnaireService(QuestionnaireRepository questionnaireRepository) {
        this.questionnaireRepository = questionnaireRepository;
    }

    public List<Questionnaire> getQuestionnaires(){
        return this.questionnaireRepository.findAll();
    }

    public Questionnaire addQuestionnaire(Questionnaire questionnaire){
        return this.questionnaireRepository.save(questionnaire);
    }

    public Optional<Questionnaire> getQuestionnaire(int id) {
        return this.questionnaireRepository.findById(id);
    }
}
