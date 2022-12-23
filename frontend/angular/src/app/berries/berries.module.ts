import { SharedModule } from './../shared/shared.module';
import { AppMaterialModule } from './../shared/app-material/app-material.module';
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { BerriesRoutingModule } from './berries-routing.module';
import { BerriesComponent } from './berries/berries.component';


@NgModule({
  declarations: [
    BerriesComponent
  ],
  imports: [
    CommonModule,
    BerriesRoutingModule,
    AppMaterialModule,
    SharedModule
  ]
})
export class BerriesModule { }
