package com.bigcracko.waterpolo.waterpolo.team;

import org.springframework.data.annotation.Id;

public class Team {

	@Id
	private String id;
	private String name;
	private String logo;
	private boolean active;

	public Team() {}
	
	public Team(String name, String logo, boolean active) {
		this.name = name;
		this.logo = logo;
		this.active = active;
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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", logo=" + logo + ", active=" + active + "]";
	}

}
