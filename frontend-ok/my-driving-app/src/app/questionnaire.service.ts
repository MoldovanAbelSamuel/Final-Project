import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class QuestionnaireService {

  constructor( private http: HttpClient) { }

  baseUrl: string = 'http://127.0.0.1:8080/questionnaires';


  getQuestionnaire(id: number): Observable<any> {
    return this.http.get(this.baseUrl + '/' + id) as Observable<any>;
  }
}
