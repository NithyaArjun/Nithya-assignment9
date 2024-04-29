package com.coderscampus.demo.repository;

import org.springframework.boot.autoconfigure.domain.EntityScan;

//import com.coderscampus.demo.CsvFileReader;
@EntityScan
public class Recipe {
	
	private Integer cookingMinutes;

	private String dairyFree;

	private String glutenFree;

	private String instructions;

	private Double preparationMinutes;

	private Double pricePerServing;

	private Integer readyInMinutes;

	private Integer servings;

	private Double spoonacularScore;

	private String title;

	private String vegan;

	private String vegetarian;

	public Integer getCookingMinutes() {
		return cookingMinutes;
	}

	public void setCookingMinutes(Integer cookingMinutes) {
		this.cookingMinutes = cookingMinutes;
	}

	public Boolean getDairyFree() {
		return Boolean.parseBoolean(dairyFree);
	}

	public void setDairyFree(String dairyFree) {
		this.dairyFree = dairyFree;
	}

	public Boolean getGlutenFree() {
		return Boolean.parseBoolean(glutenFree);
	}

	public void setGlutenFree(String glutenFree) {
		this.glutenFree = glutenFree;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public Double getPreparationMinutes() {
		return preparationMinutes;
	}

	public void setPreparationMinutes(Double preparationMinutes) {
		this.preparationMinutes = preparationMinutes;
	}

	public Double getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(Double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public Integer getServings() {
		return servings;
	}

	public void setServings(Integer servings) {
		this.servings = servings;
	}

	public Double getSpoonacularScore() {
		return spoonacularScore;
	}

	public void setSpoonacularScore(Double spoonacularScore) {
		this.spoonacularScore = spoonacularScore;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVegan() {
		return Boolean.parseBoolean(vegan);
	}

	public void setVegan(String vegan) {
		this.vegan = vegan;
	}

	public Boolean getVegetarian() {
		return Boolean.parseBoolean(vegetarian);
	}

	public void setVegetarian(String vegetarian) {
		this.vegetarian = vegetarian;
	}
	

}
