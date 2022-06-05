package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main(Model m) {
		return "main";
	}
	
	@RequestMapping("/main")
	public String main1(Model m) {
		return "main";
	}
	
	@RequestMapping("/login")
	public String login (Model m) {
		m.addAttribute("center", "login");
			return "main";
	}
	
	@RequestMapping("/register")
	public String register (Model m) {
		m.addAttribute("center", "register");
			return "main";
	}
	
	@RequestMapping("/explore")
	public String explore (Model m) {
		m.addAttribute("center", "explore");
			return "main";
	}
	
	@RequestMapping("/map")
	public String map (Model m) {
		m.addAttribute("center", "map");
			return "main";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m, String id, String pwd) {
		System.out.println(id + " " + pwd);
		if(id.equals("abc") && pwd.equals("123ㅈ")) {
			m.addAttribute("rid", id);
			m.addAttribute("center", "explore");
		} else {
			m.addAttribute("center", "loginfail");
		}
		
		m.addAttribute("left", "left");
		return "main";
	
	}
	
	@RequestMapping("/register_formimpl")
	public String register_formimpl(Model m, String id, String pwd) {
		System.out.println(id + " " + pwd);
			m.addAttribute("center", "login");
			m.addAttribute("left", "left");
			m.addAttribute("rid", id);
			return "main";
	}
	
	
	
}











