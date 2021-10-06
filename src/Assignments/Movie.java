package Assignments;

import java.util.ArrayList;

public class Movie {
	private String hero;
	private String herion;
	private String results;
	
	public Movie(String hero, String herion, String results) {
	super();
	this.hero = hero;
	this.herion = herion;
	this.results = results;
	}

	public Movie(ArrayList<String> a, ArrayList<String> a2, ArrayList<String> a3) {
		
	}

	@Override
	public String toString() {
		return "Movie [hero=" + hero + ", herion=" + herion + ", results=" + results + "]";
	}

	
	
	
}
