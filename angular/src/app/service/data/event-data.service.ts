import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Event } from 'src/app/events/events.component';
import { API_URL } from 'src/app/app.constants';

@Injectable({
  providedIn: 'root'
})
export class EventDataService {

  constructor(
    private http:HttpClient
  ) { }

  findAllEvents() {
    console.log('Execute findAllEvents - start');
    return this.http.get<Event[]>(`${API_URL}/events`);
    console.log('Execute findAllEvents - stop');
  }

  getById(id) {
    return this.http.get<Event>(`${API_URL}/events/${id}`);
  }
}
