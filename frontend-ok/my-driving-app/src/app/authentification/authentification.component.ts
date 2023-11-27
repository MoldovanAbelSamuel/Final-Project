import { Component } from '@angular/core';
import {AuthentificationService} from "../authentification.service";
import { Router } from '@angular/router';

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent {
  username: string = '';
  password: string = '';

  constructor(private authentificationService: AuthentificationService, private router: Router) {
  }

  login() {

    const user = {
      username: this.username,
      password: this.password,
    };
    if(this.username.length === 0 || this.password.length === 0){
      alert("Nu ati introdus username sau password");
      return;
    }
    this.authentificationService.loginUser(user).subscribe(
      (response) => {
        if(response !== null){
          localStorage.setItem('username', response.username);
          localStorage.setItem('password', response.password);
          this.router.navigate(['/quest']);
        }else{
          alert("Username or password incorrect");
        }

      },
      (error) => {
        console.error('Login error:', error);
      }
    );

  }

  register() {
    const user = {
      username: this.username,
      password: this.password,
    };
    if(this.username.length === 0 || this.password.length === 0){
      alert("Nu ati introdus username sau password");
      return;
    }
    this.authentificationService.registerUser(user).subscribe(
      (response) => {
        alert("Username and password were successfully registered. Please login.")
      },
      (error) => {
        console.error('Login error:', error);
      }
    );
  }
}
