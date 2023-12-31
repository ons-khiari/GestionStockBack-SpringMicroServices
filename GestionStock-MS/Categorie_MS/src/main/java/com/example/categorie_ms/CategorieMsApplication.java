package com.example.categorie_ms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CategorieMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CategorieMsApplication.class, args);
	}
	
	@Autowired
	private CategorieRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Categorie(1, "5454", "apple"));
			
			// fetch
			repository.findAll().forEach(System.out::println);

		};
	}

}
