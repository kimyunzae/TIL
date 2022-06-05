package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class suvController {

	@RequestMapping("/suv")
	public String suv(Model m) {
		m.addAttribute("center", "suv/center");
		m.addAttribute("left", "suv/left");
		return "main";
	}
	
	@RequestMapping("/suv01")
	public String suv01(Model m) {
		m.addAttribute("center", "suv/suv01");
		m.addAttribute("left", "suv/left");
		return "main";
	}
	
	@RequestMapping("/suv02")
	public String suv02(Model m) {
		m.addAttribute("center", "suv/suv02");
		m.addAttribute("left", "suv/left");
		return "main";
	}
	
	@RequestMapping("/suv03")
	public String suv03(Model m) {
		m.addAttribute("center", "suv/suv03");
		m.addAttribute("left", "suv/left");
		return "main";
	}
	
	@RequestMapping("/suv04")
	public String suv04(Model m) {
		m.addAttribute("center", "suv/suv04");
		m.addAttribute("left", "suv/left");
		return "main";
	}
	
	@RequestMapping("/suv05")
	public String suv05(Model m) {
		m.addAttribute("center", "suv/suv05");
		m.addAttribute("left", "suv/left");
		return "main";
	}
	
	@RequestMapping("/suv06")
	public String suv06(Model m) {
		m.addAttribute("center", "suv/suv06");
		m.addAttribute("left", "suv/left");
		return "main";
	}
	
}
