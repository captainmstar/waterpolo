import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Game } from 'src/app/games/games.component';
import { API_URL } from 'src/app/app.constants';

@Injectable({
  providedIn: 'root'
})
export class GameDataService {

  constructor(
    private http:HttpClient
  ) { }

  getGamesByDivision(divisionId) {
    return this.http.get<Game[]>(`${API_URL}/gamesByDivision/${divisionId}`);
  }
}
