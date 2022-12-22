import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Berry } from './../dataModel/berry';

@Injectable({
  providedIn: 'root'
})
export class BerriesService {

  constructor(private httpClient: HttpClient) {}

  list(): Berry[] {
    return [
      {_id: "1", name: 'cheri', url: 'aiushgeiase'}
    ];
  }
}
