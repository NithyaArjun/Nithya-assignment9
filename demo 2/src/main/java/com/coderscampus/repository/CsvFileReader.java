package com.coderscampus.demo.repository;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Repository;

@Repository
public class CsvFileReader {
	public List<Recipe> readRecipesFromFile() throws IOException {
		List<Recipe> recipes = new ArrayList<>();
		FileReader reader = new FileReader("recipes.txt");
		System.out.println(reader);
		@SuppressWarnings("deprecation")
		CSVFormat format = CSVFormat.DEFAULT.withQuote('"').withEscape('\\').withIgnoreSurroundingSpaces(true)
				.withFirstRecordAsHeader();
		CSVParser parser = new CSVParser(reader, format);

		for (CSVRecord record : parser) {
			Recipe recipe = new Recipe();
			recipe.setCookingMinutes(Integer.parseInt(record.get("Cooking Minutes")));
			recipe.setDairyFree(record.get("Dairy Free"));
			recipe.setGlutenFree(record.get("Gluten Free"));
			recipe.setInstructions(record.get("Instructions"));
			recipe.setPreparationMinutes(Double.parseDouble(record.get("Preparation Minutes")));
			recipe.setPricePerServing(Double.parseDouble(record.get("Price Per Serving")));
			recipe.setReadyInMinutes(Integer.parseInt(record.get("Ready In Minutes")));
			recipe.setServings(Integer.parseInt(record.get("Servings")));
			recipe.setSpoonacularScore(Double.parseDouble(record.get("Spoonacular Score")));
			recipe.setTitle(record.get("Title"));
			recipe.setVegan(record.get("Vegan"));
			recipe.setVegetarian(record.get("Vegetarian"));
			recipes.add(recipe);
		}

		reader.close();
		parser.close();
		return recipes;
	}

	public static void main(String args[]) throws IOException {
		var csvFileReader = new CsvFileReader();
		System.out.println(csvFileReader.readRecipesFromFile().get(0));
	}
}
