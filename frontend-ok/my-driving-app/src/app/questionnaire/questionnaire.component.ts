import {Component, OnInit} from '@angular/core';
import {QuestionnaireService} from "../questionnaire.service";
import {Router} from "@angular/router";

@Component({
  selector: 'app-questionnaire',
  templateUrl: './questionnaire.component.html',
  styleUrls: ['./questionnaire.component.css']
})
export class QuestionnaireComponent implements OnInit{
  answerA: string = 'A';
  answerB: string = 'B';
  answerC: string = 'C';
  question: string = '';
  selectedAnswers: number[] = [];
  totalPoints: number = 0;
  currentIndexQuestion: number = 0;
  questions: any[] = [];
  answers: any[] = [];
  correctAnswers: number[] = [];
  skipList: number[] = [];
  finishNextQuestions: boolean = false;


  constructor(private questionnaireService: QuestionnaireService, private router: Router) {
  }

  ngOnInit(): void {
    this.getQuestionnaire();
  }
  selectAnswer(ans: number){
    if (this.selectedAnswers.includes(ans)) {
      this.selectedAnswers = this.selectedAnswers.filter(a => a !== ans);
    } else {
      this.selectedAnswers.push(ans);
    }
  }

  nextQuestion(skipFlag: boolean = false) {
    this.selectedAnswers = this.selectedAnswers.slice().sort((a, b) => a - b);
    if(JSON.stringify(this.selectedAnswers) === JSON.stringify(this.correctAnswers)){
      this.totalPoints++;
    }
    if(this.selectedAnswers.length === 0 && skipFlag === false){
      alert("Nu ati selectat nici un raspuns.");
      this.currentIndexQuestion--;
    }
    this.selectedAnswers = [];
    this.correctAnswers = [];
    this.answers = [];
    this.currentIndexQuestion++;
    this.question = '';
    if (this.currentIndexQuestion === 26){
      this.finishNextQuestions = true;
    }
    if(this.skipList.length === 0 && this.finishNextQuestions) {
      localStorage.setItem('punctaj', String(this.totalPoints));
      this.router.navigate(['/result']);
    }
    if(this.finishNextQuestions && this.skipList.length !== 0){
      let index = this.skipList.shift();
      if(index != undefined){
        this.currentIndexQuestion = index;
      }
    }

    this.getQuestion();
  }

  skipQuestion() {
    this.skipList.push(this.currentIndexQuestion);
    this.nextQuestion(true);
  }

  getQuestionnaire(){
    this.questionnaireService.getQuestionnaire(1).subscribe(
      (response) => {
        this.questions = response.questions;
        this.getQuestion();
      },
      (error) => {
        console.error('Login error:', error);
      }
    );
  }

  getQuestion() {
    this.question = (this.currentIndexQuestion + 1) + ". " + this.questions[this.currentIndexQuestion].questionText + '<br>';
    for(let i = 0; i < 3; i++){
      this.question += this.questions[this.currentIndexQuestion].questionAnswers[i].answer.text + '<br>';
      this.answers.push(this.questions[this.currentIndexQuestion].questionAnswers[i]);
      if(this.answers[i].correctAnswer == true) {
        this.correctAnswers.push(i);
      }
    }
  }
}
