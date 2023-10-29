import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {AuthentificationComponent} from "./authentification/authentification.component";
import {QuestionnaireComponent} from "./questionnaire/questionnaire.component";
import {AuthGuardService} from "./auth-guard.service";
import {FinalResultComponent} from "./final-result/final-result.component";

const routes: Routes = [
  { path: '', pathMatch: 'full', redirectTo: 'auth' },
  { path: 'auth', component: AuthentificationComponent },
  { path: 'quest', component: QuestionnaireComponent,  canActivate: [AuthGuardService]},
  { path: 'result', component: FinalResultComponent, canActivate: [AuthGuardService]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
