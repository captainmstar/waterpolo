import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Event } from '../events/events.component';
import { EventDataService } from '../service/data/event-data.service';

@Component({
  selector: 'app-event',
  templateUrl: './event.component.html',
  styleUrls: ['./event.component.css']
})
export class EventComponent implements OnInit {

  event: Event;
  events: Event[];

  constructor(
    private eventDataService: EventDataService,
    private Router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.getEvent();
  }

  initData() {

  }

  getEvents() {
    
  }

  getEvent() {
    let eventId = this.route.snapshot.params['id'];
    this.event = new Event(eventId, '', new Date(), new Date());
    console.log("getEvent(): " + eventId);
    this.eventDataService.getById(eventId).subscribe(
      response => {
        console.log(response);
        this.event = response;
        console.log("event: " + this.event);
      }
    )

  }


}
