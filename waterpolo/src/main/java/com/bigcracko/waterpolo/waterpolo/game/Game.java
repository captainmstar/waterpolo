package com.bigcracko.waterpolo.waterpolo.game;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.bigcracko.waterpolo.waterpolo.location.Location;
import com.bigcracko.waterpolo.waterpolo.team.Team;

public class Game {

	public static enum GameType {
		RRA, WLF;
	}

	@Id
	private String id;
	private String eventId;
	private String divisionId;
	private String gameId;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private GameType type;
	private Location location;
	private int number;
	private Team whiteCaps;
	private Team darkCaps;
	private float whiteScore;
	private float darkScore;
	private String wto;
	private String lto;

	public Game() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public GameType getType() {
		return type;
	}

	public void setType(GameType type) {
		this.type = type;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Team getWhiteCaps() {
		return whiteCaps;
	}

	public void setWhiteCaps(Team whiteCaps) {
		this.whiteCaps = whiteCaps;
	}

	public Team getDarkCaps() {
		return darkCaps;
	}

	public void setDarkCaps(Team darkCaps) {
		this.darkCaps = darkCaps;
	}

	public float getWhiteScore() {
		return whiteScore;
	}

	public void setWhiteScore(float whiteScore) {
		this.whiteScore = whiteScore;
	}

	public float getDarkScore() {
		return darkScore;
	}

	public void setDarkScore(float darkScore) {
		this.darkScore = darkScore;
	}

	public String getWto() {
		return wto;
	}

	public void setWto(String wto) {
		this.wto = wto;
	}

	public String getLto() {
		return lto;
	}

	public void setLto(String lto) {
		this.lto = lto;
	}

	@Override
	public String toString() {
		return "Game [id=" + id + ", eventId=" + eventId + ", divisionId=" + divisionId + ", gameId=" + gameId
				+ ", startTime=" + startTime + ", endTime=" + endTime + ", type=" + type + ", location=" + location
				+ ", number=" + number + ", whiteCaps=" + whiteCaps + ", darkCaps=" + darkCaps + ", whiteScore="
				+ whiteScore + ", darkScore=" + darkScore + ", wto=" + wto + ", lto=" + lto + "]";
	}

}
