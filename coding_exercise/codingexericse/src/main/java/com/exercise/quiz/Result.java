package com.exercise.quiz;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */

@NoArgsConstructor
@AllArgsConstructor
public class Result{
 public String category;
 public String type;
 public String difficulty;
 public String question;
 public String correct_answer;
 public List<String> incorrect_answers;
 
 
public Result() {
	
}


public Result(String category, String type, String difficulty, String question, String correct_answer,
		List<String> incorrect_answers) {
	super();
	this.category = category;
	this.type = type;
	this.difficulty = difficulty;
	this.question = question;
	this.correct_answer = correct_answer;
	this.incorrect_answers = incorrect_answers;
}


public String getCategory() {
	return category;
}


public void setCategory(String category) {
	this.category = category;
}


public String getType() {
	return type;
}


public void setType(String type) {
	this.type = type;
}


public String getDifficulty() {
	return difficulty;
}


public void setDifficulty(String difficulty) {
	this.difficulty = difficulty;
}


public String getQuestion() {
	return question;
}


public void setQuestion(String question) {
	this.question = question;
}


public String getCorrect_answer() {
	return correct_answer;
}


public void setCorrect_answer(String correct_answer) {
	this.correct_answer = correct_answer;
}


public List<String> getIncorrect_answers() {
	return incorrect_answers;
}


public void setIncorrect_answers(List<String> incorrect_answers) {
	this.incorrect_answers = incorrect_answers;
}


@Override
public String toString() {
	return "Result [category=" + category + ", type=" + type + ", difficulty=" + difficulty + ", question=" + question
			+ ", correct_answer=" + correct_answer + ", incorrect_answers=" + incorrect_answers + "]";
}
 
 
 
}



