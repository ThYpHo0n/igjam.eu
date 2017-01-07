package com.innogames.igjam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {

	@RequestMapping(path = "/news", method = RequestMethod.GET)
	public String getNews() {
		return "news/list.html";
	}

	@RequestMapping(path = "/news/{id}", method = RequestMethod.GET)
	public String getNewsById(@PathVariable String id) {
		return "news/show.html";
	}

	@RequestMapping(path = "/news/category/{category}", method = RequestMethod.GET)
	public String getNewsByCategory(@PathVariable String category) {
		return "news/list.html";
	}

	@RequestMapping(path = "/news/tags/{tag}", method = RequestMethod.GET)
	public String getNewsByTag(@PathVariable String tag) {
		return "news/list.html";
	}
}
