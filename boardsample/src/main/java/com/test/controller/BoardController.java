package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@RequestMapping(value="/")
	public String index(Model model) {
//		mMap.put("seq", seq);
//		mMap.put("title", title);
//		mMap.put("content", content);		
		return "board";
	}
	
	@RequestMapping(value="/insert")
	public String insertboard(Model model) {
		return "board";
	}
}
