package com.assignment.springjokes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesIndexServiceImpl implements JokesIndexService {

	@Autowired
	private ChuckNorrisQuotes chuckNorrisQuotes;

	public String getJoke() {
		return chuckNorrisQuotes.getRandomQuote();
	}
}
