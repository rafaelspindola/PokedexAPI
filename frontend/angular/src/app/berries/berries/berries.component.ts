import { BerriesService } from './../services/berries.service';
import { Berry } from './../dataModel/berry';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-berries',
  templateUrl: './berries.component.html',
  styleUrls: ['./berries.component.scss']
})
export class BerriesComponent {

  berries: Observable<Berry[]>
  //= [{_id: '1', name: 'cheri', url: 'aiushgeiase'}];
  displayedColumns = ['name','url'];

  // berriesService: BerriesService;

  constructor(private berriesService: BerriesService) {
    // this.berries = [];
    // this.berriesService = new BerriesService();
    this.berries = this.berriesService.list();
  }

}
