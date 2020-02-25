import { Component, OnInit } from '@angular/core';
import { EventDataService } from '../service/data/event-data.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})

export class EventsComponent implements OnInit {

  events:Event[];

  constructor(
    private eventDataService:EventDataService,
    private Router:Router) { }

  ngOnInit() {
    this.getEvents();
  }

  getEvents() {
    this.eventDataService.findAllEvents().subscribe(
      response => {
        console.log(response);
        this.events = response;
      }
    );
  }

  getEvent(id) {
    console.log(`getEvent: ${id}`);
    this.Router.navigate(['events', id]);
  }

}

export class Event {
  constructor(
    public id: string,
    public name:string,
    public startTime:Date,
    public endTime:Date) {}
}
