package com.exercise.quiz.service;

import java.util.List;

import com.exercise.quiz.Result;

public interface CodingService {

	List<Result> getResult();

	

	Result getResults(String category);

}
