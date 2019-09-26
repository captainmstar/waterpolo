package com.bigcracko.waterpolo.waterpolo.location;

import org.springframework.data.annotation.Id;

public class Location {

	@Id
	private String id;
	private String name;
	private String mapUrl;

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

	public String getMapUrl() {
		return mapUrl;
	}

	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + ", mapUrl=" + mapUrl + "]";
	}

}
