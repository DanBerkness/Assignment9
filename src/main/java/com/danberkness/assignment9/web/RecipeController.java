package com.danberkness.assignment9.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.csv.CSVParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danberkness.assignment9.domain.Recipe;
import com.danberkness.assignment9.service.FileService;

@RestController
public class RecipeController {
	@Autowired
	FileService fileService;
	
	

	@GetMapping("/gluten-free")
	public Collection<Recipe> generateGlutenFreeRecipes () throws IOException {
		List<Recipe> allRecipes = new ArrayList<>();
		List<Recipe> readAllRecipes = fileService.readInData(allRecipes);
		return fileService.getGlutenFreeRecipes(readAllRecipes);
		
		
	}

	@GetMapping("/vegan")
	public Collection<Recipe> generateVeganRecipes () throws IOException {
		List<Recipe> allRecipes = new ArrayList<>();
		List<Recipe> readAllRecipes = fileService.readInData(allRecipes);
		return fileService.getVeganRecipes(readAllRecipes);
		
		
	}

	@GetMapping("/vegan-and-gluten-free")
	public Collection<Recipe> generateGlutenFreeAndVeganRecipes () throws IOException {
		List<Recipe> allRecipes = new ArrayList<>();
		List<Recipe> readAllRecipes = fileService.readInData(allRecipes);
		return fileService.getVeganAndGlutenFreeRecipes(readAllRecipes);
		
		
	}

	@GetMapping("/vegetarian")
	public Collection<Recipe> generateVegitarianRecipes () throws IOException {
		List<Recipe> allRecipes = new ArrayList<>();
		List<Recipe> readAllRecipes = fileService.readInData(allRecipes);
		return fileService.getVegitarianRecipes(readAllRecipes);
		
		
	}

	@GetMapping("/all-recipes")
	public List<Recipe> generateAllRecipes () throws IOException {
		List<Recipe> allRecipes = new ArrayList<>();
		return fileService.readInData(allRecipes);
	}
}
