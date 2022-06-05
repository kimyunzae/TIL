package com.multi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {
		@RequestMapping("/") 
		public ModelAndView main (ModelAndView mv) {
			mv.addObject("w", "Welcome !!");
			mv.setViewName("main");
			return mv;	
		}
		
		@RequestMapping("/register_view") 
		public ModelAndView register_view (ModelAndView mv) {
			mv.setViewName("register");
			return mv;  
		}
		
		@RequestMapping("/login_view") 
		public ModelAndView login_view (ModelAndView mv) {
			mv.setViewName("login");
			return mv;  
		}
		
		@RequestMapping("/register") 
		public void register2(String id, String pwd, int age, 
				String birth, String gender, String hobby, 
				String car, String resume, String loginid,
				int range) {
			System.out.println(id+" "+pwd+" "+age);
			System.out.println(birth+" "+gender+" "+hobby);
			System.out.println(resume+" "+loginid+" "+range);
		}
		
}
