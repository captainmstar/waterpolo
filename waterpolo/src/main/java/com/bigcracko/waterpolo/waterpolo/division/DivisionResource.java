package com.bigcracko.waterpolo.waterpolo.division;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bigcracko.waterpolo.waterpolo.event.Event;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class DivisionResource {
	
	@Autowired
	private DivisionRepository repository;
	
	@GetMapping("/divisionsByEvent/{id}")
	public List<Division> getByEventId(@PathVariable String id) {
		System.out.println("getByEventId: " + id);
		return repository.findByEventIdOrderByNameAsc(id);
	}
}
