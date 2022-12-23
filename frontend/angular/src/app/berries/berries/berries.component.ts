import { BerriesService } from './../services/berries.service';
import { Berry } from './../dataModel/berry';
import { Component } from '@angular/core';
import { catchError, Observable, of } from 'rxjs';

@Component({
  selector: 'app-berries',
  templateUrl: './berries.component.html',
  styleUrls: ['./berries.component.scss']
})
export class BerriesComponent {

  berries$: Observable<Berry[]>;
  // berries: Berry[] = [];
  //= [{_id: '1', name: 'cheri', url: 'aiushgeiase'}];
  displayedColumns = ['name','url'];

  // berriesService: BerriesService;

  constructor(private berriesService: BerriesService) {
    // this.berries = [];
    // this.berriesService = new BerriesService();
   this.berries$ = this.berriesService.list().pipe(
    catchError(error => {
      console.log(error);
      return of([]) // observable with empty array
    })
   );

    // this.berriesService.list().subscribe(berries => this.berries = berries );
  }

}
