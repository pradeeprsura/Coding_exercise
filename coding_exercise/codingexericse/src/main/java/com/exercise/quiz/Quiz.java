package com.exercise.quiz;

import java.util.List;

public class Quiz {

	public String category;
    public List<Result> results;
	public Quiz() {
		
	}
	public Quiz(String category, List<Result> results) {
		super();
		this.category = category;
		this.results = results;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Quiz [category=" + category + ", results=" + results + "]";
	}
    
    
}
