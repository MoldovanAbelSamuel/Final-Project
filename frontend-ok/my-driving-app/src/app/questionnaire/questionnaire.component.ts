import {Component, OnInit} from '@angular/core';
import {QuestionnaireService} from "../questionnaire.service";

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


  constructor(private questionnaireService: QuestionnaireService) {
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
    console.log(this.selectedAnswers);

  }

  nextQuestion() {
    this.selectedAnswers = this.selectedAnswers.slice().sort((a, b) => a - b);
    if(JSON.stringify(this.selectedAnswers) === JSON.stringify(this.correctAnswers)){
      this.totalPoints++;
    }
    this.selectedAnswers = [];
    this.correctAnswers = [];
    this.answers = [];
    this.currentIndexQuestion++;
    this.question = '';
    this.getQuestion();
    console.log(this.totalPoints);
  }

  skipQuestion() {

  }

  getQuestionnaire(){
    this.questionnaireService.getQuestionnaire(1).subscribe(
      (response) => {
        console.log('Login response:', response);
        console.log('questions response:', response.questions);
        this.questions = response.questions;
        this.getQuestion();

      },
      (error) => {
        console.error('Login error:', error);
      }
    );
  }

  getQuestion() {
    this.question = this.questions[this.currentIndexQuestion].questionText + '\n';
    for(let i = 0; i < 3; i++){
      this.question += this.questions[this.currentIndexQuestion].questionAnswers[i].answer.text + '\n';
      this.answers.push(this.questions[this.currentIndexQuestion].questionAnswers[i]);
      if(this.answers[i].correctAnswer == true) {
        this.correctAnswers.push(i);
      }
    }
  }



}
