import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {path: "", pathMatch: 'full', redirectTo: 'berries'},
  {
    path: 'berries',
    loadChildren: () => import('./berries/berries.module').then(m => m.BerriesModule)
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
