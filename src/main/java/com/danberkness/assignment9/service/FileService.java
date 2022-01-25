package com.danberkness.assignment9.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;

import com.danberkness.assignment9.domain.Recipe;

public class FileService {

	public List<String> readFile () throws IOException {
		List<String> allRecipes = null;
//		Recipe recipe = new Recipe();
		Reader in = new FileReader("recipes.txt");

		CSVParser records = CSVFormat.DEFAULT
									 .withIgnoreSurroundingSpaces()
									 .withEscape('\\')
									 .withFirstRecordAsHeader()
									 .parse(in);
		
		
		for (CSVRecord record : records) {
			String y = record.get("Instructions");
			System.out.println(y);
		}
		   
		
		 
		return allRecipes;
	}
}
