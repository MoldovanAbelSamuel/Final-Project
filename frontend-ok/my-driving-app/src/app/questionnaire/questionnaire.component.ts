import { Component } from '@angular/core';

@Component({
  selector: 'app-questionnaire',
  templateUrl: './questionnaire.component.html',
  styleUrls: ['./questionnaire.component.css']
})
export class QuestionnaireComponent {
  answerA: string = 'A';
  answerB: string = 'B';
  answerC: string = 'C';
  question: string = 'kjhngbfv';
  selectedAnswers: string[] = [];
  selectAnswer(ans: string){
    if (this.selectedAnswers.includes(ans)) {
      this.selectedAnswers = this.selectedAnswers.filter(a => a !== ans);
    } else {
      this.selectedAnswers.push(ans);
    }

  }

  nextQuestion() {

  }

  skipQuestion() {

  }
}
