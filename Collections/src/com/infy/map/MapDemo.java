package com.infy.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new FileReader("movies.txt"));
		String line = null;
		
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		while ((line = br.readLine())!=null) {
			String[] data = line.split(" ");
			Movie movie = new Movie();
			movie.setMovieName(data[0].trim());
			movie.setActorName(data[1].trim());
			movie.setBudjet(data[2].trim());
			movieList.add(movie);
		}
		
		/*for (Movie movie : movieList) {
			System.out.println(movie);
		}*/
		MapDemo obj = new MapDemo();
		Map<String,List<Movie>> finalMap = obj.convertToMap(movieList);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter actor name");
		String actorName = sc.next();
		
		List<Movie> actorMovList = 	finalMap.get(actorName);
		
		if(actorMovList!=null) {
			for (Movie movie : actorMovList) {
				System.out.println(movie);
			}
		}else {
			System.out.println("correct the input/enter right name");
		}
		

	}

	private  Map<String,List<Movie>> convertToMap(ArrayList<Movie> movieList) {
		// TODO Auto-generated method stub
		
		HashMap<String,List<Movie>> movieMap = new HashMap<String, List<Movie>>();
		
		for (Movie movie : movieList) {
			String key = movie.getActorName();
			
			if(movieMap.get(key)==null) {
				ArrayList<Movie> al = new ArrayList<Movie>();
				al.add(movie);
				movieMap.put(key, al);
			}else {
				List<Movie> exsList = movieMap.get(key);
				exsList.add(movie);
				movieMap.put(key, exsList);
			}
		
		}
		
		return movieMap;
	}
	
	

	
	
	

}
