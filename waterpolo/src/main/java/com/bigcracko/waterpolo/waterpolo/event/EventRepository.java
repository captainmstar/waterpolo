package com.bigcracko.waterpolo.waterpolo.event;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event, String> {

}
