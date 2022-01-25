package com.danberkness.assignment9.web;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danberkness.assignment9.domain.Recipe;

@RestController
public class RecipeController {

	@GetMapping("/gluten-free")
	public Collection<Recipe> generateGlutenFreeRecipes () {
		return null;
		
	}

	@GetMapping("/vegan")
	public Collection<Recipe> generateVeganRecipes () {
		return null;
		
	}

	@GetMapping("/vegan-and-gluten-free")
	public Collection<Recipe> generateGlutenFreeAndVeganRecipes () {
		return null;
		
	}

	@GetMapping("/vegetarian")
	public Collection<Recipe> generateVegitarianRecipes () {
		return null;
		
	}

	@GetMapping("/all-recipes")
	public Collection<Recipe> generateAllRecipes () {
		return null;
		
	}
}
