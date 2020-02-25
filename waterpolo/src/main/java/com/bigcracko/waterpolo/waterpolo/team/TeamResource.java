package com.bigcracko.waterpolo.waterpolo.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class TeamResource {
	
	@Autowired
	private TeamRepository repository;
	
	@GetMapping("/waterpolo/teams/{id}")
	public Team getTeamById(@PathVariable String id) {
		return repository.findById(id).orElse(null);
	}
	
	@GetMapping("/waterpolo/teams/name/{name}")
	public Team getTeamByName(@PathVariable String name) {
		return repository.findByName(name);
	}

}
