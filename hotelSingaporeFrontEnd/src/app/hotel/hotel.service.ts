import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import {environment} from '../../environments/environment';
import {Observable} from 'rxjs';
import {Hotel} from './hotel.model';

@Injectable({
  providedIn: 'root'
})
export class HotelService {

  constructor(
    private http: HttpClient
  ) {
  }


  getHotelList(): Observable<Hotel[]> {
    return this.http.get<Hotel[]>(environment.apiUrl);

  }

  getHotelListByName(name: string): Observable<Hotel[]> {
    return this.http.get<Hotel[]>(environment.apiUrl + name);

  }

  getHotelSortByPrice(): Observable<Hotel[]> {
    return this.http.get<Hotel[]>(environment.apiUrl);

  }
}
