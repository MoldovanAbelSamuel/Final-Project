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


	//!! First time when you run the app, don't forget to change #Update in #Create in app.prop, then change again in update
	/*@Bean
	CommandLineRunner atStartup (AnswerRepository answerRepository, QuestionRepository questionRepository,
								 QuestionnaireRepository questionnaireRepository, QuestionAnswerRepository questionAnswerRepository,
								 UserRepository userRepository){
		return args -> {
			Questionnaire questionnaire1 = new Questionnaire("Chestionarul 1");
			Question q1 = new Question("Cum trebuie să procedeze conducătorul auto atunci când circulă pe un drum cu trei\n" +
					"sau mai multe benzi pe sens?");
			Question q2 = new Question("În care dintre situaţiile de mai jos puteţi folosi banda de lângă axa drumului pe o\n" +
					"autostradă?");
			Question q3 = new Question("Cum trebuie să procedeze corect conducătorul de vehicul, pentru a trece de pe banda\n" +
					"întâi a unui drum public pe banda a treia?");
			Question q4 = new Question("Pe drumul public cu cel mult două benzi pe sens şi cu o a treia bandă pe care este\n" +
					"amplasată linia tramvaiului lângă axa drumului, conducătorii de vehicule:");
			Question q5 = new Question("Este obligat conducătorul unui vehicul să folosească banda suplimentară, la urcarea\n" +
					"în rampă, dacă viteza sa este mai mică decât cea înscrisă pe indicator?"); //e intr 11 defapt
			Question q6 = new Question("Ce obligaţii aveţi dacă, circulând pe un drumul public cu mai multe benzi, banda pe\n" +
					"care circulaţi se sfârşeşte şi trebuie să vă continuaţi deplasarea pe banda din stânga?");
			Question q7 = new Question("Circulaţia pe banda rezervată transportului public de persoane, semnalizată ca atare,\n" +
					"este permisă:");
			Question q8 = new Question("Ce obligaţii aveţi atunci când urmează să părăsiţi autostrada?");
			Question q9 = new Question("Dacă, din motive obiective, vă deplasaţi cu viteză redusă, trebuie:");
			Question q10 = new Question("Cum procedează conducătorul autovehiculului în situaţia în care vehiculul din faţa sa\n" +
					"schimbă direcţia de mers spre stânga, iar pe partea dreaptă nu este loc suficient pentru\n" +
					"depăşire?");
			Question q11 = new Question("În care dintre situaţii este interzisă schimbarea direcţiei de mers spre stânga?");
			Question q12 = new Question("Cât timp trebuie menţinută semnalizarea schimbării direcţiei de mers?");
			Question q13 = new Question("Schimbarea direcţiei de mers spre stânga, într-o intersecţie neprevăzută cu marcaje\n" +
					"de ghidare, se face:");
			Question q14 = new Question("Ce rând trebuie să ocupe conducătorul de vehicul şi de la ce distanţă, pentru a se\n" +
					"deplasa pe direcţia înainte, într-o intersecţie fără marcaje din afara localităţii?");//e intr 16
			Question q15 = new Question("La intersecţiile fără marcaje, conducătorii auto care vor să circule pe direcţia înainte\n" +
					"vor ocupa:");
			Question q16 = new Question("Când este interzisă schimbarea direcţiei de mers la dreapta, deşi este în funcţiune\n" +
					"semnalul verde?"); //e intr 30
			//chestionaru 2
			Question q17 = new Question("Care dintre tipurile de semnalizare de mai jos vor fi respectate cu prioritate?"); //2
			Question q18 = new Question("Cum procedaţi în situaţia în care semnalul roşu al semaforului este în funcţiune, iar\n" +
					"poliţistul vă adresează semnalul de a trece?"); //3
			Question q19 = new Question("La semnalul poliţistului situat într-o intersecţie, cu braţul ridicat vertical, aveţi\n" +
					"obligaţia:"); //5
			Question q20 = new Question("Ce semnifică semnalul poliţistului aflat într-o intersecţie, cu braţul drept întins\n" +
					"orizontal?");//6
			Question q21 = new Question("Braţul drept, întins orizontal, al poliţistului indică 'Oprire' pentru:");//7
			Question q22 = new Question("În situaţia în care poliţistul se află cu faţa la un autovehicul care se apropie, având\n" +
					"braţul drept întins orizontal, conducătorul auto trebuie:");//8
			Question q23 = new Question("Braţul stâng, întins orizontal, al poliţistului semnifică oprire pentru:");//9
			Question q24 = new Question("Când poliţistul se află cu spatele la autovehiculul care se apropie şi cu braţul stâng\n" +
					"întins orizontal, conducătorul acestuia trebuie:"); //10
			Question q25 = new Question(" La semnalul poliţistului având braţul stâng întins orizontal, orientat cu faţa către\n" +
					"autovehiculul care se apropie, conducătorul auto trebuie:");//11
			Question q26 = new Question(" Braţele întinse orizontal, ale poliţistului care dirijează circulaţia, semnifică:"); //12

			q1.setQuestionnaire(questionnaire1);
			q2.setQuestionnaire(questionnaire1);
			q3.setQuestionnaire(questionnaire1);
			q4.setQuestionnaire(questionnaire1);
			q5.setQuestionnaire(questionnaire1);
			q6.setQuestionnaire(questionnaire1);
			q7.setQuestionnaire(questionnaire1);
			q8.setQuestionnaire(questionnaire1);
			q9.setQuestionnaire(questionnaire1);
			q10.setQuestionnaire(questionnaire1);
			q11.setQuestionnaire(questionnaire1);
			q12.setQuestionnaire(questionnaire1);
			q13.setQuestionnaire(questionnaire1);
			q14.setQuestionnaire(questionnaire1);
			q15.setQuestionnaire(questionnaire1);
			q16.setQuestionnaire(questionnaire1);
			q17.setQuestionnaire(questionnaire1);
			q18.setQuestionnaire(questionnaire1);
			q19.setQuestionnaire(questionnaire1);
			q20.setQuestionnaire(questionnaire1);
			q21.setQuestionnaire(questionnaire1);
			q22.setQuestionnaire(questionnaire1);
			q23.setQuestionnaire(questionnaire1);
			q24.setQuestionnaire(questionnaire1);
			q25.setQuestionnaire(questionnaire1);
			q26.setQuestionnaire(questionnaire1);

			Answer a1a = new Answer("A. să circule pe banda situată lângă acostament;");
			Answer a1b = new Answer("B. să nu circule pe liniile de tramvai;");
			Answer a1c = new Answer("C. să circule pe banda a doua, respectiv a treia, cu o viteză mai mică de 100 km/h.");
			QuestionAnswer qa1a = new QuestionAnswer(q1, a1a, true);
			QuestionAnswer qa1b = new QuestionAnswer(q1, a1b, false);
			QuestionAnswer qa1c = new QuestionAnswer(q1, a1c, false);

			Answer a2a = new Answer("A. când efectuaţi depăşirea altor autovehicule, dacă celelalte benzi în direcţia de mers sunt\n" +
					"ocupate;");
			Answer a2b = new Answer("B. când conduceţi autoturismul cu viteza maximă admisă;");
			Answer a2c = new Answer("C. când nu sunteţi precedat de alte autovehicule");
			QuestionAnswer qa2a = new QuestionAnswer(q2, a2a, true);
			QuestionAnswer qa2b = new QuestionAnswer(q2, a2b, false);
			QuestionAnswer qa2c = new QuestionAnswer(q2, a2c, false);

			Answer a3a = new Answer("A. reduce viteza de mers şi trece de pe o bandă pe alta, asigurându-se continuu în oglinda\n" +
					"retrovizoare;");
			Answer a3b = new Answer("B. dacă trecerea de pe o bandă pe alta nu s-a făcut cu cel puþin 200 m înainte de intersecţie,\n" +
					"manevra nu mai este posibilă;");
			Answer a3c = new Answer("C. se asigură din spate şi semnalizează intenţia de a trece succesiv de pe banda întâi pe a\n" +
					"doua, apoi pe a treia.");
			QuestionAnswer qa3a = new QuestionAnswer(q3, a3a, false);
			QuestionAnswer qa3b = new QuestionAnswer(q3, a3b, false);
			QuestionAnswer qa3c = new QuestionAnswer(q3, a3c, true);

			Answer a4a = new Answer("A. pot folosi banda pe care este amplasată linia tramvaiului, fără să incomodeze circulaţia\n" +
					"acestuia;");
			Answer a4b = new Answer("B. nu pot folosi banda pe care este amplasată linia tramvaiului;");
			Answer a4c = new Answer("C. legal, nu este prevăzut.");
			QuestionAnswer qa4a = new QuestionAnswer(q4, a4a, true);
			QuestionAnswer qa4b = new QuestionAnswer(q4, a4b, false);
			QuestionAnswer qa4c = new QuestionAnswer(q4, a4c, false);

			Answer a5a = new Answer("A. nu, deoarece banda este destinată vehiculelor care se deplasează cu o viteză egală sau\n" +
					"superioară celei precizate de indicator;");
			Answer a5b = new Answer("B. da;");
			Answer a5c = new Answer("C. nu, fiind obligat în toate situaţiile să circule doar pe banda de lângă marginea drumului.");
			QuestionAnswer qa5a = new QuestionAnswer(q5, a5a, false);
			QuestionAnswer qa5b = new QuestionAnswer(q5, a5b, true);
			QuestionAnswer qa5c = new QuestionAnswer(q5, a5c, false);

			Answer a6a = new Answer("A. să permiteţi trecerea vehiculelor care circulă pe banda din stânga;");
			Answer a6b = new Answer("B. să semnalizaţi, pentru ca cei din spate să vă acorde prioritate;");
			Answer a6c = new Answer("C. să măriţi viteza, pentru a nu-i stânjeni pe ceilalţi participanţi la trafic.");
			QuestionAnswer qa6a = new QuestionAnswer(q6, a6a, true);
			QuestionAnswer qa6b = new QuestionAnswer(q6, a6b, false);
			QuestionAnswer qa6c = new QuestionAnswer(q6, a6c, false);

			Answer a7a = new Answer("A. vehiculelor care efectuează transport public de persoane şi autovehiculelor cu regim de\n" +
					"circulaţie prioritar, atunci când se deplasează în acţiuni de intervenţie sau în misiuni care au\n" +
					"caracter de urgenţă;");
			Answer a7b = new Answer("B. numai vehiculelor care efectuează transport public de persoane;");
			Answer a7c = new Answer("C. tuturor vehiculelor, dacă nu incomodează circulaţia vehiculelor prioritare.");
			QuestionAnswer qa7a = new QuestionAnswer(q7, a7a, true);
			QuestionAnswer qa7b = new QuestionAnswer(q7, a7b, false);
			QuestionAnswer qa7c = new QuestionAnswer(q7, a7c, false);

			Answer a8a = new Answer("A. să reduceţi viteza începând cu 300 m înainte de ieşirea de pe autostradă, în dreptul\n" +
					"panoului care marchează această distanţă;");
			Answer a8b = new Answer("B. să circulaţi pe prima bandă cu o viteză de maximum 60 km/oră;");
			Answer a8c = new Answer("C. să semnalizaţi din timp şi să vă angajaţi pe banda de ieşire (decelerare).");
			QuestionAnswer qa8a = new QuestionAnswer(q8, a8a, false);
			QuestionAnswer qa8b = new QuestionAnswer(q8, a8b, false);
			QuestionAnswer qa8c = new QuestionAnswer(q8, a8c, true);

			Answer a9a = new Answer("A. să circulaţi numai pe banda de lângă acostament sau bordură;");
			Answer a9b = new Answer("B. să circulaţi numai pe banda de lângă axul drumului, semnalizând cu luminile de avarie;");
			Answer a9c = new Answer("C. să emiteţi semnale luminoase şi sonore, pentru a preveni orice posibil eveniment.");
			QuestionAnswer qa9a = new QuestionAnswer(q9, a9a, true);
			QuestionAnswer qa9b = new QuestionAnswer(q9, a9b, false);
			QuestionAnswer qa9c = new QuestionAnswer(q9, a9c, false);

			Answer a10a = new Answer("A. semnalizează şi execută depăşirea cu viteză redusă;");
			Answer a10b = new Answer("B. încearcă depăşirea prin stânga;");
			Answer a10c = new Answer("C. aşteaptă eliberarea benzii pentru a-şi continua deplasarea.");
			QuestionAnswer qa10a = new QuestionAnswer(q10, a10a, false);
			QuestionAnswer qa10b = new QuestionAnswer(q10, a10b, false);
			QuestionAnswer qa10c = new QuestionAnswer(q10, a10c, true);

			Answer a11a =new Answer("A. când conducătorul de vehicul este încadrat pe banda din dreapta;");
			Answer a11b =new Answer("B. când drumul pe care urmează să se intre este semnalizat cu indicatorul „Circulaţia interzisă\n" +
					"în ambele sensuri”;");
			Answer a11c =new Answer("C. când strada pe care urmează să se intre este semnalizată cu indicatorul „Drum fără ieşire”.");
			QuestionAnswer qa11a = new QuestionAnswer(q11, a11a, true);
			QuestionAnswer qa11b = new QuestionAnswer(q11, a11b, true);
			QuestionAnswer qa11c = new QuestionAnswer(q11, a11c, false);

			Answer a12a = new Answer("A. 10 secunde de la începerea manevrei;");
			Answer a12b = new Answer("B. pe întreaga durată a executării manevrei;");
			Answer a12c = new Answer("C. legea nu prevede nimic cu privire la acest aspect.");
			QuestionAnswer qa12a = new QuestionAnswer(q12, a12a, false);
			QuestionAnswer qa12b = new QuestionAnswer(q12, a12b, true);
			QuestionAnswer qa12c = new QuestionAnswer(q12, a12c, false);

			Answer a13a = new Answer("A. prin ocolirea centrului imaginar al intersecţiei;");
			Answer a13b = new Answer("B. prin stânga centrului imaginar al intersecţiei, fără a intersecta traiectoria celor care se\n" +
					"deplasează din sens opus şi care virează la stânga;");
			Answer a13c = new Answer("C. la libera înţelegere cu cei care se deplasează din sens opus.");
			QuestionAnswer qa13a = new QuestionAnswer(q13, a13a, false);
			QuestionAnswer qa13b = new QuestionAnswer(q13, a13b, true);
			QuestionAnswer qa13c = new QuestionAnswer(q13, a13c, false);

			Answer a14a = new Answer("A. rândul din stânga, de la o distanţă de cel puţin 100 m;");
			Answer a14b = new Answer("B. rândul din stânga sau din dreapta, de la o distanţă de cel puţin 50 m;");
			Answer a14c = new Answer("C. rândul din dreapta, de la o distanţă de cel puţin 100 m");
			QuestionAnswer qa14a = new QuestionAnswer(q14, a14a, false);
			QuestionAnswer qa14b = new QuestionAnswer(q14, a14b, true);
			QuestionAnswer qa14c = new QuestionAnswer(q14, a14c, false);

			Answer a15a = new Answer("A. rândul din stânga;");
			Answer a15b = new Answer("B. rândul din dreapta;");
			Answer a15c = new Answer("C. oricare dintre rânduri.");
			QuestionAnswer qa15a = new QuestionAnswer(q15, a15a, false);
			QuestionAnswer qa15b = new QuestionAnswer(q15, a15b, false);
			QuestionAnswer qa15c = new QuestionAnswer(q15, a15c, true);

			Answer a16a = new Answer("A. când semaforul nu este însoţit de un semn adiţional ce conţine o săgeată cu vârful către\n" +
					"dreapta;");
			Answer a16b = new Answer("B. când la dreapta se află o stradă cu sens unic;");
			Answer a16c = new Answer("C. când banda pe care se află încadrat conducătorul de vehicul este semnalizată cu indicator\n" +
					"şi marcaj direcţional care indică mersul înainte.");
			QuestionAnswer qa16a = new QuestionAnswer(q16, a16a, false);
			QuestionAnswer qa16b = new QuestionAnswer(q16, a16b, false);
			QuestionAnswer qa16c = new QuestionAnswer(q16, a16c, true);

			Answer a17a = new Answer("A. semnalele luminoase;");
			Answer a17b = new Answer("B. semnalizarea temporară, care modifică regimul normal de desfăşurare a circulaţiei;");
			Answer a17c = new Answer("C. semnalele şi indicaţiile poliţistului.");
			QuestionAnswer qa17a = new QuestionAnswer(q17, a17a, false);
			QuestionAnswer qa17b = new QuestionAnswer(q17, a17b, false);
			QuestionAnswer qa17c = new QuestionAnswer(q17, a17c, true);

			Answer a18a = new Answer("A. aşteptaţi apariţia semnalului de culoare verde, care vă permite să circulaţi cu autovehiculul\n" +
					"prin intersecţie;");
			Answer a18b = new Answer("B. atrageţi atenţia poliţistului că există neconcordanţă între semnalul său şi cel al semaforului;\n");
			Answer a18c = new Answer("C. respectaţi semnalul poliţistului.");
			QuestionAnswer qa18a = new QuestionAnswer(q18, a18a, false);
			QuestionAnswer qa18b = new QuestionAnswer(q18, a18b, false);
			QuestionAnswer qa18c = new QuestionAnswer(q18, a18c, true);

			Answer a19a = new Answer("A. să circulaţi cu prudenţă maximă;");
			Answer a19b = new Answer("B. să reduceţi viteza;");
			Answer a19c = new Answer("C. să opriţi, indiferent din ce direcţie circulaţi.");
			QuestionAnswer qa19a = new QuestionAnswer(q19, a19a, false);
			QuestionAnswer qa19b = new QuestionAnswer(q19, a19b, false);
			QuestionAnswer qa19c = new QuestionAnswer(q19, a19c, true);

			Answer a20a = new Answer("A. oprire pentru vehiculele şi pietonii care vin din faţa acestuia;");
			Answer a20b = new Answer("B. oprire pentru vehiculele şi pietonii care vin din spatele acestuia;");
			Answer a20c = new Answer("C. oprire pentru vehiculele şi pietonii care vin din faţa şi din spatele acestuia.");
			QuestionAnswer qa20a = new QuestionAnswer(q20, a20a, false);
			QuestionAnswer qa20b = new QuestionAnswer(q20, a20b, true);
			QuestionAnswer qa20c = new QuestionAnswer(q20, a20c, false);

			Answer a21a = new Answer("A. vehiculele şi pietonii care vin din faţă;");
			Answer a21b = new Answer("B. vehiculele şi pietonii care vin din spate;");
			Answer a21c = new Answer("C. vehiculele şi pietonii care vin din faţă şi din spate.");
			QuestionAnswer qa21a = new QuestionAnswer(q21, a21a, false);
			QuestionAnswer qa21b = new QuestionAnswer(q21, a21b, true);
			QuestionAnswer qa21c = new QuestionAnswer(q21, a21c, false);

			Answer a22a = new Answer("A. să oprească, deoarece semnalul i se adresează;");
			Answer a22b = new Answer("B. să continue deplasarea, deoarece semnalul nu i se adresează;");
			Answer a22c = new Answer("C. să schimbe direcţia de mers spre stânga.");
			QuestionAnswer qa22a = new QuestionAnswer(q22, a22a, false);
			QuestionAnswer qa22b = new QuestionAnswer(q22, a22b, true);
			QuestionAnswer qa22c = new QuestionAnswer(q22, a22c, false);

			Answer a23a = new Answer("A. vehiculele care vin din faţă;");
			Answer a23b = new Answer("B. vehiculele care vin din spate;");
			Answer a23c = new Answer("C. vehiculele care vin din faţă şi din spate.");
			QuestionAnswer qa23a = new QuestionAnswer(q23, a23a, true);
			QuestionAnswer qa23b = new QuestionAnswer(q23, a23b, false);
			QuestionAnswer qa23c = new QuestionAnswer(q23, a23c, false);

			Answer a24a = new Answer("A. să continue deplasarea, deoarece semnalul de oprire nu i se adresează;");
			Answer a24b = new Answer("B. să schimbe direcţia de mers spre stânga;");
			Answer a24c = new Answer("C. să oprească, deoarece semnalul i se adresează.");
			QuestionAnswer qa24a = new QuestionAnswer(q24, a24a, true);
			QuestionAnswer qa24b = new QuestionAnswer(q24, a24b, false);
			QuestionAnswer qa24c = new QuestionAnswer(q24, a24c, false);

			Answer a25a = new Answer("A. să reducă viteza;");
			Answer a25b = new Answer("B. să oprească imediat;");
			Answer a25c = new Answer("C. să continue deplasarea.");
			QuestionAnswer qa25a = new QuestionAnswer(q25, a25a, false);
			QuestionAnswer qa25b = new QuestionAnswer(q25, a25b, true);
			QuestionAnswer qa25c = new QuestionAnswer(q25, a25c, false);

			Answer a26a = new Answer("A. oprire pentru toţi participanţii la trafic care, indiferent de sensul lor de mers, circulă din\n" +
					"direcţia sau direcţiile intersectate de braţele întinse ale acestuia;");
			Answer a26b = new Answer("B. oprire pentru toţi participanţii la trafic care circulă numai din spatele acestuia;");
			Answer a26c = new Answer("C. oprire pentru toţi participanţii la trafic care circulă numai din faţa acestuia.");
			QuestionAnswer qa26a = new QuestionAnswer(q26, a26a, true);
			QuestionAnswer qa26b = new QuestionAnswer(q26, a26b, false);
			QuestionAnswer qa26c = new QuestionAnswer(q26, a26c, false);




			List<Question> questions = new ArrayList<>();
			questions.add(q1);
			questionnaire1.setQuestions(questions);


			List<Answer> listAnswer = new ArrayList<>();
			listAnswer.add(a1a);
			listAnswer.add(a1b);
			listAnswer.add(a1c);

			listAnswer.add(a2a);
			listAnswer.add(a2b);
			listAnswer.add(a2c);

			listAnswer.add(a3a);
			listAnswer.add(a3b);
			listAnswer.add(a3c);

			listAnswer.add(a4a);
			listAnswer.add(a4b);
			listAnswer.add(a4c);

			listAnswer.add(a5a);
			listAnswer.add(a5b);
			listAnswer.add(a5c);

			listAnswer.add(a6a);
			listAnswer.add(a6b);
			listAnswer.add(a6c);

			listAnswer.add(a7a);
			listAnswer.add(a7b);
			listAnswer.add(a7c);

			listAnswer.add(a8a);
			listAnswer.add(a8b);
			listAnswer.add(a8c);

			listAnswer.add(a9a);
			listAnswer.add(a9b);
			listAnswer.add(a9c);

			listAnswer.add(a10a);
			listAnswer.add(a10b);
			listAnswer.add(a10c);

			listAnswer.add(a11a);
			listAnswer.add(a11b);
			listAnswer.add(a11c);

			listAnswer.add(a12a);
			listAnswer.add(a12b);
			listAnswer.add(a12c);

			listAnswer.add(a13a);
			listAnswer.add(a13b);
			listAnswer.add(a13c);

			listAnswer.add(a14a);
			listAnswer.add(a14b);
			listAnswer.add(a14c);

			listAnswer.add(a15a);
			listAnswer.add(a15b);
			listAnswer.add(a15c);

			listAnswer.add(a16a);
			listAnswer.add(a16b);
			listAnswer.add(a16c);

			listAnswer.add(a17a);
			listAnswer.add(a17b);
			listAnswer.add(a17c);

			listAnswer.add(a18a);
			listAnswer.add(a18b);
			listAnswer.add(a18c);

			listAnswer.add(a19a);
			listAnswer.add(a19b);
			listAnswer.add(a19c);

			listAnswer.add(a20a);
			listAnswer.add(a20b);
			listAnswer.add(a20c);

			listAnswer.add(a21a);
			listAnswer.add(a21b);
			listAnswer.add(a21c);

			listAnswer.add(a22a);
			listAnswer.add(a22b);
			listAnswer.add(a22c);

			listAnswer.add(a23a);
			listAnswer.add(a23b);
			listAnswer.add(a23c);

			listAnswer.add(a24a);
			listAnswer.add(a24b);
			listAnswer.add(a24c);

			listAnswer.add(a25a);
			listAnswer.add(a25b);
			listAnswer.add(a25c);

			listAnswer.add(a26a);
			listAnswer.add(a26b);
			listAnswer.add(a26c);

			answerRepository.saveAllAndFlush(listAnswer);

			questionnaireRepository.saveAndFlush(questionnaire1);

			List<Question> listQuestions = new ArrayList<>();
			listQuestions.add(q1);
			listQuestions.add(q2);
			listQuestions.add(q3);
			listQuestions.add(q4);
			listQuestions.add(q5);
			listQuestions.add(q6);
			listQuestions.add(q7);
			listQuestions.add(q8);
			listQuestions.add(q9);
			listQuestions.add(q10);
			listQuestions.add(q11);
			listQuestions.add(q12);
			listQuestions.add(q13);
			listQuestions.add(q14);
			listQuestions.add(q15);
			listQuestions.add(q16);
			listQuestions.add(q17);
			listQuestions.add(q18);
			listQuestions.add(q19);
			listQuestions.add(q20);
			listQuestions.add(q21);
			listQuestions.add(q22);
			listQuestions.add(q23);
			listQuestions.add(q24);
			listQuestions.add(q25);
			listQuestions.add(q26);


			questionRepository.saveAllAndFlush(listQuestions);

			List<QuestionAnswer> QA1 = new ArrayList<>();
			QA1.add(qa1a);
			QA1.add(qa1b);
			QA1.add(qa1c);

			QA1.add(qa2a);
			QA1.add(qa2b);
			QA1.add(qa2c);

			QA1.add(qa3a);
			QA1.add(qa3b);
			QA1.add(qa3c);

			QA1.add(qa4a);
			QA1.add(qa4b);
			QA1.add(qa4c);

			QA1.add(qa5a);
			QA1.add(qa5b);
			QA1.add(qa5c);

			QA1.add(qa6a);
			QA1.add(qa6b);
			QA1.add(qa6c);

			QA1.add(qa7a);
			QA1.add(qa7b);
			QA1.add(qa7c);

			QA1.add(qa8a);
			QA1.add(qa8b);
			QA1.add(qa8c);

			QA1.add(qa9a);
			QA1.add(qa9b);
			QA1.add(qa9c);

			QA1.add(qa10a);
			QA1.add(qa10b);
			QA1.add(qa10c);

			QA1.add(qa11a);
			QA1.add(qa11b);
			QA1.add(qa11c);

			QA1.add(qa12a);
			QA1.add(qa12b);
			QA1.add(qa12c);

			QA1.add(qa13a);
			QA1.add(qa13b);
			QA1.add(qa13c);

			QA1.add(qa14a);
			QA1.add(qa14b);
			QA1.add(qa14c);

			QA1.add(qa15a);
			QA1.add(qa15b);
			QA1.add(qa15c);

			QA1.add(qa16a);
			QA1.add(qa16b);
			QA1.add(qa16c);

			QA1.add(qa17a);
			QA1.add(qa17b);
			QA1.add(qa17c);

			QA1.add(qa18a);
			QA1.add(qa18b);
			QA1.add(qa18c);

			QA1.add(qa19a);
			QA1.add(qa19b);
			QA1.add(qa19c);

			QA1.add(qa20a);
			QA1.add(qa20b);
			QA1.add(qa20c);

			QA1.add(qa21a);
			QA1.add(qa21b);
			QA1.add(qa21c);

			QA1.add(qa22a);
			QA1.add(qa22b);
			QA1.add(qa22c);

			QA1.add(qa23a);
			QA1.add(qa23b);
			QA1.add(qa23c);

			QA1.add(qa24a);
			QA1.add(qa24b);
			QA1.add(qa24c);

			QA1.add(qa25a);
			QA1.add(qa25b);
			QA1.add(qa25c);

			QA1.add(qa26a);
			QA1.add(qa26b);
			QA1.add(qa26c);




			questionAnswerRepository.saveAllAndFlush(QA1);

		};
	}*/

}
