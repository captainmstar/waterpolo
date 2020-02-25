import { Component, OnInit, Input } from '@angular/core';
import { Event } from '../events/events.component';
import { DivisionDataService } from '../service/data/division-data.service';

@Component({
  selector: 'app-divisions',
  templateUrl: './divisions.component.html',
  styleUrls: ['./divisions.component.css']
})
export class DivisionsComponent implements OnInit {

  @Input() event: Event;
  divisions: Division[];
  selectedDivision: Division;

  constructor(
    private divisionDataService: DivisionDataService
  ) { }

  ngOnInit() {
    this.getDivisions();
  }

  getDivisions() {
    console.log("getDivisions() " + this.event.id);
    this.divisionDataService.getDivisionsByEvent(this.event.id).subscribe(
      response => {
        console.log(response);
        this.divisions = response;
        this.setSelectedDivision();
      }
    )
  }

  setSelectedDivision() {
    this.selectedDivision = this.divisions.find(d => d.promoted);
  }

  onChange(selectedDivision) {
    console.log("onChange(): " + selectedDivision.name);
    this.selectedDivision = selectedDivision;
  }


}

export class Division {
  constructor(
    public id: string,
    public name: string,
    public promoted: boolean
  ) { }
}
