package demo.domain;

import java.util.Set;

public class TeamDAO {
	String name;
	String location;
	String mascotte;
	Set<PlayerDAO> players;
	
	public TeamDAO() {
		super();
	}

	public TeamDAO(String location, String name, Set<PlayerDAO> players) {
		this();
		this.location = location;
		this.name = name;
		this.players = players;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	public Set<PlayerDAO> getPlayers() {
		return players;
	}
	public void setPlayers(Set<PlayerDAO> players) {
		this.players = players;
	}
}
