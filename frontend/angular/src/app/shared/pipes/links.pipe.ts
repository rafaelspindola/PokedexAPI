import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'links'
})
export class LinksPipe implements PipeTransform {

  transform(value: string): string {
    return 'link';
  }

}
