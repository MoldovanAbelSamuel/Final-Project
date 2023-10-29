import {Component, OnInit} from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-final-result',
  templateUrl: './final-result.component.html',
  styleUrls: ['./final-result.component.css']
})
export class FinalResultComponent implements OnInit{
  punctajStorage: string | null = localStorage.getItem('punctaj');
  punctaj: number = 0;
  constructor(private router: Router) {}

  ngOnInit(): void {
    if(this.punctajStorage != null){
      this.punctaj = parseInt(this.punctajStorage, 10);
    }
  }

  redirectToQuest() {
    this.router.navigate(['/quest']);
  }
}
