package com.sxds.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.sxds.portal.model.Product;

@Controller
public class OrderController {
	
	@PostMapping("add")
	public int add(Product product) {
		
		return 1;
	}
}
