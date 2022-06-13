package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.MainBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@Controller
public class MainController {

	@Autowired
	MainBiz biz;
	
	@RequestMapping("/")
	public String main(Model m) {
		int ccnt = 0;
		int pcnt = 0;
		try {
			ccnt = biz.getCustCnt();
			pcnt = biz.getProductCnt();
			m.addAttribute("ccnt", ccnt);
			m.addAttribute("pcnt", pcnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "index";
	}
	
	@RequestMapping("search")
	public String search(Model m, String txt) {
		List<ProductVO> list = null;
		
		try {
			list = biz.searchproduct(txt);
			m.addAttribute("sproduct", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		m.addAttribute("center", "search");
		return "/index";
	}
	
	@RequestMapping("/login")
	public String login(Model m) {	
		m.addAttribute("center", "login");
		return "/index";
	}
	
	@RequestMapping("/loginimpl")
	public String loginimpl(Model m) {	
		String next = "";
		AdminVO admin = null;
		try {
			cust = cbiz.get(id);
			if(cust!=null) {
				if(cust.getPwd().equals(pwd)) {
					session.setAttribute("logincust", cust);
					m.addAttribute("logincust", cust);
					next = "loginok";
				} else {
					throw new Exception();
				}
			} else {
				throw new Exception();
			}
		} catch (Exception e) {
			next="loginfail";
		}
		
		m.addAttribute("center", next);
		return "main";
	}
	
}




