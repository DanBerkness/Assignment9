package com.danberkness.assignment9.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.danberkness.assignment9.domain.Recipe;

@Service
public class FileService {

	public List<Recipe> readInData(List<Recipe> allRecipes) throws IOException {
		
		Reader in = new FileReader("recipes.txt");
		
		CSVParser records = CSVFormat.DEFAULT
				.withIgnoreSurroundingSpaces()
				.withEscape('\\')
				.withFirstRecordAsHeader()
				.parse(in);

		for (CSVRecord record : records) {
			Recipe recipe = new Recipe(Integer.parseInt(record.get("Cooking Minutes"))
					, Boolean.parseBoolean(record.get("Dairy Free"))
					, Boolean.parseBoolean(record.get("Gluten Free"))
					, record.get("Instructions")
					, Double.parseDouble(record.get("Preparation Minutes"))
					, Double.parseDouble(record.get("Price Per Serving"))
					, Integer.parseInt(record.get("Ready In Minutes"))
					, Integer.parseInt(record.get("Servings"))
					, Double.parseDouble(record.get("Spoonacular Score"))
					, record.get("Title")
					, Boolean.parseBoolean(record.get("Vegan"))
					, Boolean.parseBoolean(record.get("Vegetarian")));
			
			allRecipes.add(recipe);
		}
		return allRecipes;
	}
	
	
	
	
	
	public List<Recipe> getGlutenFreeRecipes(List<Recipe> allRecipes) {
		List<Recipe> glutenFreeRecipes = new ArrayList<>();
		
		for (Recipe recipe : allRecipes) {
			if (recipe.getGlutenFree().equals(true)) {
				
				glutenFreeRecipes.add(recipe);
			}
		}
		return glutenFreeRecipes;
	}
	
	public List<Recipe> getVeganRecipes(List<Recipe> allRecipes) {
		List<Recipe> veganRecipes = new ArrayList<>();
		
		for (Recipe recipe : allRecipes) {
			if (recipe.getVegan().equals(true)) {
				
				veganRecipes.add(recipe);
			}
		}
		return veganRecipes;
	}
	
	public List<Recipe> getVeganAndGlutenFreeRecipes(List<Recipe> allRecipes) {
		List<Recipe> veganAndGlutenFreeRecipes = new ArrayList<>();
		
		for (Recipe recipe : allRecipes) {
			if (recipe.getVegan().equals(true) && recipe.getVegan().equals(true)) {
				
				veganAndGlutenFreeRecipes.add(recipe);
			}
		}
		return veganAndGlutenFreeRecipes;
	}
	
	public List<Recipe> getVegitarianRecipes(List<Recipe> allRecipes) {
		List<Recipe> vegitarianRecipes = new ArrayList<>();
		
		for (Recipe recipe : allRecipes) {
			if (recipe.getVegetarian().equals(true)) {
				
				vegitarianRecipes.add(recipe);
			}
		}
		return vegitarianRecipes;
	}
	
}
