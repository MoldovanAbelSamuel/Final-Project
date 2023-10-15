import { Component } from '@angular/core';
import {AuthentificationService} from "../authentification.service";

@Component({
  selector: 'app-authentification',
  templateUrl: './authentification.component.html',
  styleUrls: ['./authentification.component.css']
})
export class AuthentificationComponent {
  username: string = '';
  password: string = '';

  constructor(private authentificationService: AuthentificationService) {
  }

  login() {

    const user = {
      username: this.username,
      password: this.password,
    };

    this.authentificationService.loginUser(user).subscribe(
      (response) => {
        console.log('Login response:', response);
      },
      (error) => {
        console.error('Login error:', error);
      }
    );

    console.log('Logging in with username:', this.username);
  }

  register() {
    const user = {
      username: this.username,
      password: this.password,
    };

    this.authentificationService.registerUser(user).subscribe(
      (response) => {
        console.log('Login response:', response);
      },
      (error) => {
        console.error('Login error:', error);
      }
    );
    console.log('Registering with username:', this.username);
  }
}
