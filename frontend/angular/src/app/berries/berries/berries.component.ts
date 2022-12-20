import { Berry } from './../dataModel/berry';
import { Component } from '@angular/core';

@Component({
  selector: 'app-berries',
  templateUrl: './berries.component.html',
  styleUrls: ['./berries.component.scss']
})
export class BerriesComponent {

  berries: Berry[] = [
    {_id: "1", name: 'cheri', url: 'aiushgeiase'}
  ];
  displayedColumns = ['name','url'];

  constructor() {
    // this.berries = [];
  }

}
