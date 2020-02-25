package com.bigcracko.waterpolo.waterpolo.division;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DivisionRepository extends MongoRepository<Division, String> {

	public List<Division> findByEventIdOrderByNameAsc(String eventId);
}
