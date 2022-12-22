import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Berry } from './../dataModel/berry';
import { first, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BerriesService {

  private readonly API = '/frontend/angular/src/assets/berries.json';

  constructor(private httpClient: HttpClient) {}

  list() { //: Berry[]
    return this.httpClient.get<Berry[]>(this.API).pipe(
      first(),
      tap(berries => console.log(berries))
    ); //observable
  }
}
