package demo;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import demo.dao.TeamDao;
import demo.domain.Player;
import demo.domain.Team;

@SpringBootApplication
public class MicroserviceBootdemoApplication extends SpringBootServletInitializer{
	
	/**
	 * Used for Jar
	 * */
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceBootdemoApplication.class, args);
	}
	
	/**
	 * Used for War
	 * */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroserviceBootdemoApplication.class);
	}
	
	@PostConstruct
	public void init() {
		Set<Player> players = new HashSet<>();
		players.add(new Player("Charlie","Pitcher"));
		players.add(new Player("Snoopy", "shortstop"));
		
		Team team = new Team("California", "Peanuts", players);
		teamDao.save(team);
	}
	
	@Autowired TeamDao teamDao;
}
