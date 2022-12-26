import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Berry } from './../dataModel/berry';
import { delay, first, tap } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BerriesService {

  private readonly API = 'api/berry';

  constructor(private httpClient: HttpClient) {}

  list() { //: Berry[]
    return this.httpClient.get<Berry[]>(this.API)
    .pipe(
      first(), delay(2000),
      tap(berries => console.log(berries))
    ); //observable
  }
}
