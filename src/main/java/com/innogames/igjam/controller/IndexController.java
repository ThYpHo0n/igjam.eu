package com.innogames.igjam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@RequestMapping(path = "/", method = RequestMethod.GET)
	@ResponseBody
	public String getIndex() {
		return "test";
	}
}
