package com.assignment.springjokes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@SpringBootApplication
public class SpringJokesappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJokesappApplication.class, args);
	}
	
	@Bean
	public ChuckNorrisQuotes getChuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}
