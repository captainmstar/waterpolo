package com.bigcracko.waterpolo.waterpolo.division;

import org.springframework.data.annotation.Id;

public class Division {

	@Id
	private String id;
	private String eventId;
	private String name;
	private boolean promoted;

	public Division() {
	}

	public Division(String eventId, String name, boolean promoted) {
		this.eventId = eventId;
		this.name = name;
		this.promoted = promoted;
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

	public boolean isPromoted() {
		return promoted;
	}

	public void setPromoted(boolean promoted) {
		this.promoted = promoted;
	}

	@Override
	public String toString() {
		return "Division [id=" + id + ", eventId=" + eventId + ", name=" + name + ", promoted=" + promoted + "]";
	}
}
