package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Autowired
//	private RecipeRepository recipeRepository;

	@GetMapping("/")
	public String home() {
		return "This is a demo app to test AWS deployment and containerization";
	}
//	@PostMapping("/add")
//	public Recipe addRecipe(@RequestBody Recipe recipe) {
//		return recipeRepository.save(recipe);
//	}
//	@GetMapping("/fetch")
//	public List<Recipe> fetchAllRecipes() { return recipeRepository.findAll(); }

}
