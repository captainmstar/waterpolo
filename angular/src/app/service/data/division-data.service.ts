import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_URL } from 'src/app/app.constants';
import { Division } from 'src/app/divisions/divisions.component';

@Injectable({
  providedIn: 'root'
})
export class DivisionDataService {

  constructor(
    private http:HttpClient
  ) { }

  getDivisionsByEvent(eventId) {
    return this.http.get<Division[]>(`${API_URL}/divisionsByEvent/${eventId}`);
  }
}
