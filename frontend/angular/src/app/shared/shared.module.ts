import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from './app-material/app-material.module';
import { ErrorDialogComponent } from './components/error-dialog/error-dialog.component';



@NgModule({ // components
  declarations: [
    ErrorDialogComponent
  ],
  imports: [ // modules
    CommonModule,
    AppMaterialModule
  ],
  exports: [ErrorDialogComponent]
})
export class SharedModule { }
