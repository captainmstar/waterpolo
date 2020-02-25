package com.bigcracko.waterpolo.waterpolo.event;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.bigcracko.waterpolo.waterpolo.location.Location;
import com.bigcracko.waterpolo.waterpolo.team.Team;

public class Event {

	@Id
	private String id;
	private String name;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	//private boolean active @Todo

	public Event() {
	}

	public Event(String name, LocalDateTime startTime, LocalDateTime endTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}

}
