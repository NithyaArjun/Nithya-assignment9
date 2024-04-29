package com.coderscampus.demo.service;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.demo.repository.CsvFileReader;
import com.coderscampus.demo.repository.Recipe;

@Service
public class RecipeService {
	@Autowired
	private CsvFileReader csvFileReader;
	private final List<Recipe> recipe;

	public RecipeService(List<Recipe> recipe) {
		this.recipe = recipe;
	}

	public Collection<Recipe> getGlutenFreeRecipe() throws IOException {
		List<Recipe> recipes = csvFileReader.readRecipesFromFile();
		System.out.println(recipes);
		return recipes.stream().filter(Recipe::getGlutenFree).collect(Collectors.toList());

	}

	public Collection<Recipe> getVeganFreeRecipe() throws IOException {
		List<Recipe> recipes = csvFileReader.readRecipesFromFile();
		return recipes.stream().filter(Recipe::getVegan).collect(Collectors.toList());
	}

	public Collection<Recipe> getVeganAndGlutenFree() throws IOException {
		List<Recipe> recipes = csvFileReader.readRecipesFromFile();
		return recipes.stream().filter(recipe -> recipe.getGlutenFree() && recipe.getVegan())
				.collect(Collectors.toList());
	}

	public Collection<Recipe> getVegetarianRecipe() throws IOException {
		List<Recipe> recipes = csvFileReader.readRecipesFromFile();
		return recipes.stream().filter(Recipe::getVegetarian).collect(Collectors.toList());
	}

	public Collection<Recipe> getAllRecipe() throws IOException {
		List<Recipe> recipes = csvFileReader.readRecipesFromFile();

		return recipes;
	}

}