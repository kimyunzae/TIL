package com.multi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.multi.biz.CateBiz;
import com.multi.biz.ProductBiz;
import com.multi.frame.Util;
import com.multi.vo.CateVO;
import com.multi.vo.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductBiz biz;
	
	@Autowired
	CateBiz cbiz;
	
	@RequestMapping("/add")
	public String add(Model m) {
		List<CateVO> list = null;
		try {
			list = cbiz.get();
			m.addAttribute("clist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/add");
		return "/index";
	}
	@RequestMapping("/select")
	public String select(Model m) {
		List<ProductVO> list = null;
		try {
			list = biz.get();
			m.addAttribute("plist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/select");
		return "/index";
	}
	
	@RequestMapping("/detail")
	public String detail(Model m, int id) {
		ProductVO obj = null;
		List<CateVO> list = null;
		try {
			list = cbiz.get();
			m.addAttribute("clist", list);
			obj = biz.get(id);
			m.addAttribute("dp", obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("center", "product/detail");
		return "/index";
	}
	
	
	@RequestMapping("/addimpl")
	public String addimpl(Model m, ProductVO p) {
		// name, price, cid, mf(->imgname)
		String imgname = p.getMf().getOriginalFilename();
		p.setImgname(imgname);
		
		try {
			biz.register(p);
			Util.saveFile(p.getMf());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
	
	@RequestMapping("/update")
	public String update(Model m, ProductVO p) {
	
		String iname = p.getMf().getOriginalFilename();
		if(!(iname.equals(""))) {
			p.setImgname(iname);
			Util.saveFile(p.getMf());
		}
		try {
			biz.modify(p);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "redirect:select";
	}
	
}













