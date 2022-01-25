package com.danberkness.Assignment9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RecipeGeneratorApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	public List<String> readFile () throws IOException {
		List<String> allRecipes = null;
//		Recipe recipe = new Recipe();
		
		Reader in = new FileReader("recipes.txt");
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
		System.out.println(records);
		for (CSVRecord record : records) {
			String g = record.get(0);
			System.out.println(g);
			
			assertEquals(11, record.get("Cooking Minutes"));
//			assertEquals("Preheat oven to 450 degrees. "
//					+ "Arrange salmon in a shallow baking pan. Season with salt and pepper. "
//					+ "Roast until no longer pink in the middle and flaky, 10 to 13 minutes. "
//					+ "Using a flat spatula, remove fillets, leaving skin on the baking sheet."
//					, record.get("nstructions"));
			
//			Recipe recipe = new Recipe(Integer.parseInt
//					(record.get("Cooking Minutes"))
//					, Boolean.parseBoolean(record.get(" Dairy Free"))
//					, Boolean.parseBoolean(record.get(" Gluten Free"))
//					, record.get(" Instructions")
//					, Double.parseDouble(record.get(" Preparation Minutes"))
//					, Double.parseDouble(record.get(" Price Per Serving"))
//					, Integer.parseInt(record.get(" Ready In Minutes"))
//					, Integer.parseInt(record.get(" Servings"))
//					, Double.parseDouble(record.get(" Spoonacular Score"))
//					, record.get(" Title")
//					, Boolean.parseBoolean(record.get(" Vegan"))
//					, Boolean.parseBoolean(record.get(" Vegitarian")));
//			System.out.println(recipe);
		}
		return allRecipes;
		
		
	}
	

}
