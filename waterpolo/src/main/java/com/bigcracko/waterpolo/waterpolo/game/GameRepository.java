package com.bigcracko.waterpolo.waterpolo.game;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {

	public List<Game> findByEventId(String eventId);
	public List<Game> findByDivisionId(String divisionId);
}
