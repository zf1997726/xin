package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	//maiche_list
	@RequestMapping(value="maiche_list")
	public String homepage() {
		return "maiche_list";
	}
	
	
	@RequestMapping(value="gengduo")
	public String gengduo() {
		return "gengduo";
	}
}
