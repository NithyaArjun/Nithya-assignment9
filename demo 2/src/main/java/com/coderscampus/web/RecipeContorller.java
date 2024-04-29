package com.coderscampus.demo.web;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.demo.repository.Recipe;
import com.coderscampus.demo.service.RecipeService;

@RestController
@RequestMapping("/recipes")
public class RecipeContorller {
	private final RecipeService recipeService;

	public RecipeContorller(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@GetMapping("/gluten-free")
	public Collection<Recipe> getGlutenFreeRecipes() throws IOException {

		return recipeService.getGlutenFreeRecipe();

	}

	@GetMapping("/vegan")
	public Collection<Recipe> getVeganFreeRecipes() throws IOException {
		return recipeService.getVeganFreeRecipe();
	}

	@GetMapping("/Vegetarian")
	public Collection<Recipe> getVegetarianRecipes() throws IOException {
		return recipeService.getVegetarianRecipe();
	}

	@GetMapping("/VeganAndGlutenFree")
	public Collection<Recipe> getVegeterianAndGlutenFreeRecipe() throws IOException {
		return recipeService.getVeganAndGlutenFree();
	}

	@GetMapping("/AllRecipe")
	public Collection<Recipe> getAllRecipe() throws IOException {
		return recipeService.getAllRecipe();
	}

}
