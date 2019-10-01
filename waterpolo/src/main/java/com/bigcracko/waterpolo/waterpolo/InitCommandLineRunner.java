package com.bigcracko.waterpolo.waterpolo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bigcracko.waterpolo.waterpolo.division.Division;
import com.bigcracko.waterpolo.waterpolo.division.DivisionRepository;
import com.bigcracko.waterpolo.waterpolo.event.Event;
import com.bigcracko.waterpolo.waterpolo.event.EventRepository;
import com.bigcracko.waterpolo.waterpolo.game.Game;
import com.bigcracko.waterpolo.waterpolo.game.GameRepository;
import com.bigcracko.waterpolo.waterpolo.location.Location;
import com.bigcracko.waterpolo.waterpolo.location.LocationRepository;
import com.bigcracko.waterpolo.waterpolo.team.Team;
import com.bigcracko.waterpolo.waterpolo.team.TeamRepository;

@Component
public class InitCommandLineRunner implements CommandLineRunner {

	@Autowired
	private EventRepository eventRepository;

	@Autowired
	private DivisionRepository divisionRepository;

	@Autowired
	private GameRepository gameRepository;

	@Autowired
	private TeamRepository teamRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		eventRepository.deleteAll();
		divisionRepository.deleteAll();
		gameRepository.deleteAll();
		locationRepository.deleteAll();
		teamRepository.deleteAll();

		// Event
		LocalDateTime startTime = LocalDateTime.of(2019, 10, 15, 8, 0);
		LocalDateTime endTime = LocalDateTime.of(2019, 10, 17, 20, 0);
		Event event = new Event("Kap 7", startTime, endTime);
		eventRepository.save(event);
		
		startTime = LocalDateTime.of(2019, 11, 15, 8, 0);
		endTime = LocalDateTime.of(2019, 11, 17, 20, 0);
		event = new Event("Orange Cup", startTime, endTime);
		eventRepository.save(event);
		
		startTime = LocalDateTime.of(2019, 12, 15, 8, 0);
		endTime = LocalDateTime.of(2019, 12, 17, 20, 0);
		event = new Event("Heinman Tournament", startTime, endTime);
		eventRepository.save(event);
		
		startTime = LocalDateTime.of(2020, 1, 15, 8, 0);
		endTime = LocalDateTime.of(2020, 1, 17, 20, 0);
		event = new Event("Rick Pallow Invitational", startTime, endTime);
		eventRepository.save(event);
		

		// fetch event
		System.out.println("Event:");
		List<Event> eventsResult = eventRepository.findAll();
		eventsResult.stream().forEach(System.out::println);
		System.out.println("-------------------------------");

		// Division
		Division division = new Division(event.getId(), "12U Boys Classic", false);
		divisionRepository.save(division);
		Division promotedDivision = new Division(event.getId(), "12U Boys Platinum", true);
		divisionRepository.save(promotedDivision);
		Division division2 = new Division(event.getId(), "12U Boys Gold", false);
		divisionRepository.save(division2);
		division2 = new Division(event.getId(), "14U Boys Classic", false);
		divisionRepository.save(division2);
		division2 = new Division(event.getId(), "14U Boys Platinum", false);
		divisionRepository.save(division2);
		division2 = new Division(event.getId(), "14U Boys Gold", false);
		divisionRepository.save(division2);

		// fetch all divisions
		System.out.println("Divisions found:");
		List<Division> divisionsResult = divisionRepository.findAll();
		divisionsResult.stream().forEach(System.out::println);
		System.out.println("-------------------------------");

		// add some teams
		List<Team> teams = new ArrayList<>();
		Team kahuna = new Team("Kahuna", "kahuna.jpg", true);
		Team socal = new Team("Socal-B", "socal.jpg", true);
		teams.add(kahuna);
		teams.add(socal);
		teams.add(new Team("Empire", "empire.jpg", true));
		teams.add(new Team("Laguna Hills", "laguna.jpg", true));
		teamRepository.saveAll(teams);

		// fetch all teams
		System.out.println("Teams found with findAll():");
		List<Team> teamsResult = teamRepository.findAll();
		teamsResult.stream().forEach(System.out::println);
		System.out.println("-------------------------------");

		// Location
		Location location = new Location();
		location.setName("El Toro HS 2");
		location.setMapUrl("http://google.com");
		locationRepository.save(location);

		// fetch all locations
		System.out.println("Locations found with findAll():");
		List<Location> locationsResult = locationRepository.findAll();
		locationsResult.stream().forEach(System.out::println);
		System.out.println("-------------------------------");

		// Game
		Game game = new Game();
		game.setEventId(event.getId());
		game.setDivisionId(promotedDivision.getId());
		game.setGameId("12BX-001");
		game.setDarkCaps(kahuna);
		game.setWhiteCaps(socal);
		game.setType(Game.GameType.RRA);
		game.setLocation(location);
		game.setStartTime(LocalDateTime.now());
		gameRepository.save(game);

		// fetch all games
		System.out.println("Games found with findAll():");
		List<Game> gamesResult = gameRepository.findAll();
		gamesResult.stream().forEach(System.out::println);
		System.out.println("-------------------------------");

		//Find games by event
		gamesResult = gameRepository.findByEventId(event.getId());
		System.out.println("findByEventId(event.getId():");
		gamesResult.stream().forEach(System.out::println);
		System.out.println("-------------------------------");
		
//		Find games by division
		gamesResult = gameRepository.findByDivisionIdOrderByStartTimeAsc(division.getId());
		System.out.println("findByDivisionId(division.getId():");
		gamesResult.stream().forEach(System.out::println);
		System.out.println("-------------------------------");
	}

}
