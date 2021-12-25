package com.infy.map;

public class Movie {
	
	private String movieName;
	private String actorName;
	private String budjet;
	
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	public String getBudjet() {
		return budjet;
	}
	public void setBudjet(String budjet) {
		this.budjet = budjet;
	}
	
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", actorName=" + actorName + ", budjet=" + budjet + "]";
	}
	
	
	

}
