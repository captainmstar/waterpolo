package com.bigcracko.waterpolo.waterpolo.division;

import org.springframework.data.annotation.Id;

public class Division {

	@Id
	private String id;
	private String eventId;
	private String name;

	public Division() {
	}

	public Division(String eventId, String name) {
		this.eventId = eventId;
		this.name = name;
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

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	@Override
	public String toString() {
		return "Division [id=" + id + ", eventId=" + eventId + ", name=" + name + "]";
	}

}
