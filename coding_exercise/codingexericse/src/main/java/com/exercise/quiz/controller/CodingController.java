package com.exercise.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.exercise.quiz.Result;
import com.exercise.quiz.service.CodingService;

@RestController
public class CodingController {
	
@Autowired	
public CodingService codingService;

@GetMapping("/coding/exercise/quiz")
public List<Result> getResult(){
	return this.codingService.getResult();
	
}

@GetMapping("/coding/exercise/quiz/{category}")
public Result getResults(@PathVariable String category) {
	
	return this.codingService.getResults(category);
}


}
