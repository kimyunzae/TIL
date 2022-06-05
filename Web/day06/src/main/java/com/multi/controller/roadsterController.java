package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class roadsterController {
	
	@RequestMapping("/roadster")
	public String roadster(Model m) {
		m.addAttribute("center", "roadster/center");
		m.addAttribute("left", "roadster/left");
		return "main";
	}
	
	@RequestMapping("/roadster01")
	public String roadster01(Model m) {
		m.addAttribute("center", "roadster/roadster01");
		m.addAttribute("left", "roadster/left");
		return "main";
	}
	
	@RequestMapping("/roadster02")
	public String roadster02(Model m) {
		m.addAttribute("center", "roadster/roadster02");
		m.addAttribute("left", "roadster/left");
		return "main";
	}
	
	@RequestMapping("/roadster03")
	public String roadster03(Model m) {
		m.addAttribute("center", "roadster/roadster03");
		m.addAttribute("left", "roadster/left");
		return "main";
	}
	
	@RequestMapping("/roadster04")
	public String roadster04(Model m) {
		m.addAttribute("center", "roadster/roadster04");
		m.addAttribute("left", "roadster/left");
		return "main";
	}
	
	@RequestMapping("/roadster05")
	public String roadster05(Model m) {
		m.addAttribute("center", "roadster/roadster05");
		m.addAttribute("left", "roadster/left");
		return "main";
	}
	
	@RequestMapping("/roadster06")
	public String roadster06(Model m) {
		m.addAttribute("center", "roadster/roadster06");
		m.addAttribute("left", "roadster/left");
		return "main";
	}
	
}
