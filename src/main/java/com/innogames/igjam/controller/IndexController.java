package com.innogames.igjam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getIndex(Model model) {
		model.addAttribute("name", "FooBar");

		return "index";
	}
}
