package com.assignment.springjokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.springjokes.service.JokesIndexService;

@Controller
public class JokesIndexController {
	
	@Autowired
	private JokesIndexService jokesIndexService;
	
	@RequestMapping("/")
	public String getJoke(Model model) {
		model.addAttribute("joke",jokesIndexService.getJoke());
		return "index";
	}
}
