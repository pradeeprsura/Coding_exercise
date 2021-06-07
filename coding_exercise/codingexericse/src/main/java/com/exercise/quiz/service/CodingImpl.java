package com.exercise.quiz.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.exercise.quiz.Result;

public class CodingImpl implements CodingService {

	List<Result> list;

	public CodingImpl() {

		List<String> incorrect_answers = Arrays.asList("Pilot", "Rush", "AC/DC");
		List<String> incorrect_answers1 = Arrays.asList("Quad Ectoplasmic Driver", "Question Every Dog",
				"Quality Edward Device");
		List<String> incorrect_answers2 = Arrays.asList("Hyrule", "Gysahl", "Besaid");
		List<String> incorrect_answers3 = Arrays.asList("Nolan North", "John DiMaggio");
		List<String> incorrect_answers4 = Arrays.asList("Tom Kenny", "3", "5", "6");
		List<String> incorrect_answers5 = Arrays.asList("Jared Leto","Will Smith","Margot Robbie");
		List<String> incorrect_answers6 = Arrays.asList("100","98","73");
		List<String> incorrect_answers7 = Arrays.asList("Roy Alphard","Petelgeuse Romanee-Conti","Louis Arneb");
		List<String> incorrect_answers8 = Arrays.asList("Reyn","Fiora","Dunban");
		List<String> incorrect_answers9 = Arrays.asList("Valor Form","Wisdom Form","Anti Form");
		list = new ArrayList<>();

		list.add(new Result("Entertainment: Music", "multiple", "medium",
				"Who had a 1973 hit with the song &#039;Hocus Pocus&#039;?", "Focus", incorrect_answers));
		list.add(new Result("Entertainment: Video Games", "multiple", "medium",
				"In the &quot;Call Of Duty: Zombies&quot; map &quot;Moon&quot;,there is a secondary called the QED. What does QED stand for?",
				"Quantum Entanglement Device", incorrect_answers1));
		list.add(new Result("Entertainment: Video Games", "multiple", "medium",
				"Where does &quot;The Legend of Zelda: Majora&#039;s Mask&quot; take place?", "Termina",
				incorrect_answers2));
		list.add(new Result("Entertainment: Cartoon & Animations", "multiple", "medium",
				"Who voiced Finn in Adventure Time?", "Jeremy Shada", incorrect_answers3));
		list.add(new Result("General Knowledge", "multiple", "medium",
				"The Fields Medal, one of the most sought after awards in mathematics, is awarded every how many years?",
				"Focus", incorrect_answers4));
		list.add(new Result("Entertainment: Film", "multiple", "easy",
				"Which of these actors\\/actresses is NOT a part of the cast for the 2016 movie &quot;Suicide Squad&quot;?",
				"Scarlett Johansson", incorrect_answers5));
		list.add(new Result("Entertainment: Video Games", "multiple", "hard",
				"How many total monsters appear in Monster Hunter Generations?",
				"105", incorrect_answers6));
		list.add(new Result("Entertainment: Japanese Anime & Manga", "multiple", "medium",
				"In the &quot;Re:Zero&quot; manga series, which of the following Sin Archbishops eats Rem&#039;s existence?",
				"Ley Batenkaitos", incorrect_answers7));
		list.add(new Result("Entertainment: Video Games", "multiple", "easy",
				"What is the name of the main protagonist in &quot;Xenoblade Chronicles&quot;?",
				"Shulk", incorrect_answers8));
		list.add(new Result("Entertainment: Video Games", "multiple", "hard",
				"Which drive form was added into Kingdom Hearts II Final Mix?",
				"Limit Form", incorrect_answers9));
	}

	@Override
	public List<Result> getResult() {

		return list;
	}

	@Override
	public Result getResults(String Category) {
		
		Result r = null;
		for(Result result : list) {
			if(result.getCategory() == Category) {
				r = result;
				break;
			}
		}
		return r;
	}

}
