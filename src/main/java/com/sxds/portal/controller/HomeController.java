package com.sxds.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

	@GetMapping({"/",""})
	public String init() {
		return "index";
	}
}
