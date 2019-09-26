package com.bigcracko.waterpolo.waterpolo.team;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {

	public Team findByName(String name);
}
