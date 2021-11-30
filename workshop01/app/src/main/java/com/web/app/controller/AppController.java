package com.web.app.controller;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
	
	Logger logger = LogManager.getLogger(AppController.class);
	
	@GetMapping("/")
	public String index(Model model) {		
		String[] str = {
				"Logic will get you from A to B. Imagination will take you everywhere.",
				"There are 10 kinds of people. Those who know binary and those who don't.",
				"There are two ways of constructing a software design. One way is to make it so simple that"
				+ "there are obviously no deficiencies and the other is to make it so complicated that there"
				+ "are no obvious deficiencies.",
				"It's not that I'm so smart, it's just that I stay with problems longer.",
				"It's pitch dark. You are likely to be eated by a grue."
		};
		
		Random rd = new Random();
		int index = rd.nextInt(str.length);
		model.addAttribute("str", str[index]);
		return "index";
	}

}