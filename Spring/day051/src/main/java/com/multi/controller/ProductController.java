package com.multi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductBiz pbiz;

	@RequestMapping("")
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		mv.addObject("center", "product/center");
		return mv;
	}

	@RequestMapping("/register")
	public String register(Model m) {
		m.addAttribute("left", "product/left");
		m.addAttribute("center", "product/register");
		return "main";
	}
	
	@RequestMapping("/registerimpl")
	public ModelAndView registerimpl(ModelAndView mv, ProductVO product) {
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		try {
			pbiz.register(product);
			int cnt = pbiz.getcnt();
			mv.addObject("cnt", cnt);
			mv.addObject("center", "product/registerok");
		} catch (Exception e) {
			mv.addObject("center", "product/registerfail");
		}
		return mv;
	}
	

	@RequestMapping("/select")
	public ModelAndView select(ModelAndView mv) {
		mv.setViewName("main");
		mv.addObject("left", "product/left");
		mv.addObject("center", "product/select");
		return mv;
	}

}
