import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "./User";

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {

  constructor( private http: HttpClient) { }

  baseUrl: string = 'http://127.0.0.1:8080/users/'

  registerUser(user: User): Observable<any> {
    return  this.http.post(this.baseUrl + 'register', user) as Observable<any>;
  }

  loginUser(user: User): Observable<any> {
    return  this.http.post(this.baseUrl + 'login', user) as Observable<any>;
  }
}
