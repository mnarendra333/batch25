package com.pragim.onetomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="custom_team")
public class IPLTeam {

	@Id
	private int id;
	
	@Column(length = 30)
	private String teamName;
	
	@Column(length = 30)
	private String city;
	
	@Column(length = 30)
	private String owner;
	
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Player.class)
	private Set<Player> playerList;
	

	public Set<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(Set<Player> playerList) {
		this.playerList = playerList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
