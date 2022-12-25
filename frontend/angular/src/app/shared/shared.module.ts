import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from './app-material/app-material.module';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';
import { LinksPipe } from './pipes/links.pipe';



@NgModule({ // components
  declarations: [
    ErrorDialogComponent,
    LinksPipe
  ],
  imports: [ // modules
    CommonModule,
    AppMaterialModule
  ],
  exports: [
    ErrorDialogComponent,
    LinksPipe]
})
export class SharedModule { }
