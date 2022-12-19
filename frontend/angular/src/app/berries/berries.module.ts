import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { BerriesRoutingModule } from './berries-routing.module';
import { BerriesComponent } from './berries/berries.component';


@NgModule({
  declarations: [
    BerriesComponent
  ],
  imports: [
    CommonModule,
    BerriesRoutingModule
  ]
})
export class BerriesModule { }
