package demo;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.domain.PlayerDAO;
import demo.domain.TeamDAO;

@Controller
public class webController {
	
	private TeamDAO team;
	
	@PostConstruct
	public void init() {
		Set<PlayerDAO> players = new HashSet<>();
		players.add(new PlayerDAO("Charlie","Pitcher"));
		players.add(new PlayerDAO("Snoopy", "shortstop"));
		
		team = new TeamDAO("California", "Peanuts", players);
	}
	
	@RequestMapping("/hi")
	public @ResponseBody TeamDAO message() {
		return team;
	}
}
