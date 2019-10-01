import { Component, OnInit, Input } from '@angular/core';
import { Division } from '../divisions/divisions.component';
import { GameDataService } from '../service/data/game-data.service';

@Component({
  selector: 'app-games',
  templateUrl: './games.component.html',
  styleUrls: ['./games.component.css']
})
export class GamesComponent implements OnInit {

  private _division: Division;
  games: Game[];

  constructor(
    private gameDataService: GameDataService
  ) { }

  ngOnInit() {
  }

  @Input()
  set division(division: Division) {
    console.log("set division: " + division);
    this._division = division;
    this.getGames();
  }

  get division(): Division { return this._division; }

  getGames() {
    console.log("getGames() " + this._division.id);
    this.gameDataService.getGamesByDivision(this._division.id).subscribe(
      response => {
        console.log(response);
        this.games = response;
      }
    )

  }

}

export class Game {
  constructor(
    public id: string,
    public eventId: string,
    public divisionId: string,
    public whiteCaps: Team,
    public whiteScore: number,
    public darkCaps: Team,
    public darkScore: number
  ) { }
}

export class Team {
  constructor(
    public id: string,
    public name: string,
    public logo: string
  ) { }
}
