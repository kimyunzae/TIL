package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.vo.CateVO;

@Controller
@RequestMapping("/cate")
public class CateController {
	@Autowired
	CateBiz biz;
	
	@RequestMapping("/select")
	public String select(Model m) {
		List<CateVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cate/select");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id ) {
		
		CateVO obj = null;
		List<CateVO> list = null;
		try {
			obj = biz.get(id);
			list = biz.getmain();
			m.addAttribute("c", obj);
			m.addAttribute("slist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cate/detail");
		return "/index";
	}

	@RequestMapping("/delete")
	public String delete(int id, Model m) {
		try {
			biz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
			return "redirect:detail?id="+id;
		}
		return "redirect:select";
	}
	
	@RequestMapping("/add")
	public String add(Model m) {
		List<CateVO> list = null;
		try {
			list = biz.getmain();
			m.addAttribute("slist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "cate/add");
		return "/index";
	}
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, CateVO c) {
		try {
			biz.register(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:select";
	}
	
	@RequestMapping("/update")
	public String update(Model m, CateVO c) {
		try {
			biz.modify(c);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:detail?id="+c.getId();
	}
	
}



















