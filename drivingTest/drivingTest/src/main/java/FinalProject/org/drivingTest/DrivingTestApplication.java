package FinalProject.org.drivingTest;

import FinalProject.org.drivingTest.Model.Answer;
import FinalProject.org.drivingTest.Model.Question;
import FinalProject.org.drivingTest.Model.QuestionAnswer;
import FinalProject.org.drivingTest.Model.Questionnaire;
import FinalProject.org.drivingTest.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DrivingTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrivingTestApplication.class, args);
	}

//	@Bean
//	CommandLineRunner atStartup (AnswerRepository answerRepository, QuestionRepository questionRepository,
//								 QuestionnaireRepository questionnaireRepository, QuestionAnswerRepository questionAnswerRepository,
//								 UserRepository userRepository){
//		return args -> {
//			Questionnaire questionnaire1 = new Questionnaire("Chestionarul 1");
//			Question q1 = new Question("Cum trebuie să procedeze conducătorul auto atunci când circulă pe un drum cu trei\n" +
//					"sau mai multe benzi pe sens?");
//			Question q2 = new Question("În care dintre situaţiile de mai jos puteţi folosi banda de lângă axa drumului pe o\n" +
//					"autostradă?");
//			Question q3 = new Question("Cum trebuie să procedeze corect conducătorul de vehicul, pentru a trece de pe banda\n" +
//					"întâi a unui drum public pe banda a treia?");
//			Question q4 = new Question("Pe drumul public cu cel mult două benzi pe sens şi cu o a treia bandă pe care este\n" +
//					"amplasată linia tramvaiului lângă axa drumului, conducătorii de vehicule:");
//			Question q5 = new Question("Este obligat conducătorul unui vehicul să folosească banda suplimentară, la urcarea\n" +
//					"în rampă, dacă viteza sa este mai mică decât cea înscrisă pe indicator?\n"); //e intr 11 defapt
//			Question q6 = new Question("Ce obligaţii aveţi dacă, circulând pe un drumul public cu mai multe benzi, banda pe\n" +
//					"care circulaţi se sfârşeşte şi trebuie să vă continuaţi deplasarea pe banda din stânga?");
//			Question q7 = new Question("Circulaţia pe banda rezervată transportului public de persoane, semnalizată ca atare,\n" +
//					"este permisă:");
//			Question q8 = new Question("Ce obligaţii aveţi atunci când urmează să părăsiţi autostrada?");
//			Question q9 = new Question("Dacă, din motive obiective, vă deplasaţi cu viteză redusă, trebuie:");
//			Question q10 = new Question("Cum procedează conducătorul autovehiculului în situaţia în care vehiculul din faţa sa\n" +
//					"schimbă direcţia de mers spre stânga, iar pe partea dreaptă nu este loc suficient pentru\n" +
//					"depăşire?");
//
//			q1.setQuestionnaire(questionnaire1);
//			q2.setQuestionnaire(questionnaire1);
//			q3.setQuestionnaire(questionnaire1);
//			q4.setQuestionnaire(questionnaire1);
//			q5.setQuestionnaire(questionnaire1);
//			q6.setQuestionnaire(questionnaire1);
//			q7.setQuestionnaire(questionnaire1);
//			q8.setQuestionnaire(questionnaire1);
//			q9.setQuestionnaire(questionnaire1);
//			q10.setQuestionnaire(questionnaire1);
//
//			Answer a1a = new Answer("A. să circule pe banda situată lângă acostament;");
//			Answer a1b = new Answer("B. să nu circule pe liniile de tramvai;");
//			Answer a1c = new Answer("C. să circule pe banda a doua, respectiv a treia, cu o viteză mai mică de 100 km/h.");
//
//			Answer a2a = new Answer("A. când efectuaţi depăşirea altor autovehicule, dacă celelalte benzi în direcţia de mers sunt\n" +
//					"ocupate;");
//			Answer a2b = new Answer("B. când conduceţi autoturismul cu viteza maximă admisă;");
//			Answer a2c = new Answer("C. când nu sunteţi precedat de alte autovehicule");
//
//			QuestionAnswer qa1a = new QuestionAnswer(q1, a1a, true);
//			QuestionAnswer qa1b = new QuestionAnswer(q1, a1b, false);
//			QuestionAnswer qa1c = new QuestionAnswer(q1, a1c, false);
//
//			QuestionAnswer qa2a = new QuestionAnswer(q2, a2a, true);
//			QuestionAnswer qa2b = new QuestionAnswer(q2, a2b, false);
//			QuestionAnswer qa2c = new QuestionAnswer(q2, a2c, false);
//
//			List<Question> questions = new ArrayList<>();
//			questions.add(q1);
//			questionnaire1.setQuestions(questions);
//
//
//			List<Answer> listAnswer = new ArrayList<>();
//			listAnswer.add(a1a);
//			listAnswer.add(a1b);
//			listAnswer.add(a1c);
//			listAnswer.add(a2a);
//			listAnswer.add(a2b);
//			listAnswer.add(a2c);
//
//			answerRepository.saveAllAndFlush(listAnswer);
//
//			questionnaireRepository.saveAndFlush(questionnaire1);
//
//			List<Question> listQuestions = new ArrayList<>();
//			listQuestions.add(q1);
//			listQuestions.add(q2);
//			listQuestions.add(q3);
//			listQuestions.add(q4);
//			listQuestions.add(q5);
//			listQuestions.add(q6);
//			listQuestions.add(q7);
//			listQuestions.add(q8);
//			listQuestions.add(q9);
//			listQuestions.add(q10);
//
//			questionRepository.saveAllAndFlush(listQuestions);
//
//			List<QuestionAnswer> QA1 = new ArrayList<>();
//			QA1.add(qa1a);
//			QA1.add(qa1b);
//			QA1.add(qa1c);
//			QA1.add(qa2a);
//			QA1.add(qa2b);
//			QA1.add(qa2c);
//
//			questionAnswerRepository.saveAllAndFlush(QA1);
//
//
////			answerRepository.save(a1a);
////			answerRepository.save(a1b);
////			answerRepository.save(a1c);
////			questionAnswerRepository.save(qa1a);
////			questionAnswerRepository.save(qa1b);
////			questionAnswerRepository.save(qa1c);
////
////			answerRepository.save(a2a);
////			answerRepository.save(a2b);
////			answerRepository.save(a2c);
////			questionAnswerRepository.save(qa2a); //asta ne salveaza in repo si question si question_answer
////			questionAnswerRepository.save(qa2b);
////			questionAnswerRepository.
//
//		};
//	}

}
