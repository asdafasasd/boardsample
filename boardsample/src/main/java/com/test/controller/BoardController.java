package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {
	
	@RequestMapping(value="/")
	public String index(@RequestParam(defaultValue = "이상한이름", title = "title") String title, 
			ModelMap mMap) {
		mMap.put("seq", seq);
		mMap.put("title", title);
		mMap.put("content", content);
		
		return "board";
	}
}
