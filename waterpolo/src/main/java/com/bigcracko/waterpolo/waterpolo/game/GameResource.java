package com.bigcracko.waterpolo.waterpolo.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class GameResource {
	
	@Autowired
	private GameRepository repository;
	
	@GetMapping("/gamesByDivision/{id}")
	public List<Game> getByDivisionId(@PathVariable String id) {
		System.out.println("getByDivisionId: " + id);
		return repository.findByDivisionIdOrderByStartTimeAsc(id);
	}
}
