package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sedanController {

	@RequestMapping("/sedan")
	public String sedan(Model m) {
		m.addAttribute("center", "sedan/center");
		m.addAttribute("left", "sedan/left");
		return "main";
	}
	
	@RequestMapping("/sedan01")
	public String sedan01(Model m) {
		m.addAttribute("center", "sedan/sedan01");
		m.addAttribute("left", "sedan/left");
		return "main";
	}
	
	@RequestMapping("/sedan02")
	public String sedan02(Model m) {
		m.addAttribute("center", "sedan/sedan02");
		m.addAttribute("left", "sedan/left");
		return "main";
	}
	
	@RequestMapping("/sedan03")
	public String sedan03(Model m) {
		m.addAttribute("center", "sedan/sedan03");
		m.addAttribute("left", "sedan/left");
		return "main";
	}
	
	@RequestMapping("/sedan04")
	public String sedan04(Model m) {
		m.addAttribute("center", "sedan/sedan04");
		m.addAttribute("left", "sedan/left");
		return "main";
	}
	
	@RequestMapping("/sedan05")
	public String sedan05(Model m) {
		m.addAttribute("center", "sedan/sedan05");
		m.addAttribute("left", "sedan/left");
		return "main";
	}
	
	@RequestMapping("/sedan06")
	public String sedan06(Model m) {
		m.addAttribute("center", "sedan/sedan06");
		m.addAttribute("left", "sedan/left");
		return "main";
	}
	
	
}
