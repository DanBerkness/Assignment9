package com.danberkness.assignment9;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.danberkness.assignment9.service.FileService;

@SpringBootApplication
public class RecipeGeneratorApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(RecipeGeneratorApplication.class, args);
		
		FileService fileService = new FileService();
		fileService.readFile();
	}

}
