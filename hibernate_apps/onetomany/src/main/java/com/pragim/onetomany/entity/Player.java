package com.pragim.onetomany.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="custom_player")
public class Player {

	@Id
	private int id;
	
	@Column(length = 30)
	private String playerName;
	private int age;
	
	@Column(length = 30)
	private String playerType;
	private int runs;

	private int wkts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWkts() {
		return wkts;
	}

	public void setWkts(int wkts) {
		this.wkts = wkts;
	}

}
