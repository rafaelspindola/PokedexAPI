import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatTableModule } from '@angular/material/table';

import { BerriesRoutingModule } from './berries-routing.module';
import { BerriesComponent } from './berries/berries.component';


@NgModule({
  declarations: [
    BerriesComponent
  ],
  imports: [
    CommonModule,
    BerriesRoutingModule,
    MatTableModule,
    MatCardModule
  ]
})
export class BerriesModule { }
