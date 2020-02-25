package com.bigcracko.waterpolo.waterpolo.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class EventResource {
	
	@Autowired
	private EventRepository repository;

	@GetMapping("/events")
	public List<Event> getEvents() {
		System.out.println("getEvents()");
		return repository.findAll();
	}
	
	@GetMapping("/events/{id}")
	public Event getEvent(@PathVariable String id) {
		System.out.println("getEvent(): " + id);
		Event event = repository.findById(id).orElse(null);
		System.out.println("event: " + event);
		return event;
	}
	
}
