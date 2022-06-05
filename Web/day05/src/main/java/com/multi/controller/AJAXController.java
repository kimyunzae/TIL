package com.multi.controller;

import java.util.Date;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AJAXController {

	@RequestMapping("/gettime")
	public Object gettime() {
		Date d = new Date();
		return "서버시간: " + d.toString();

	}

	@RequestMapping("/checkid")
	public Object checkid(String id) {
		String result = "";

		if (id.equals("James") || id.equals("Tommy") || id.equals("Kirk")) {
			result = "0";
		} else {
			result = "1";
		}
		return result;

	}

	@RequestMapping("/search")
	@ResponseBody
	public Object search(String s) {
		String data = "";
		if (s.equals("a")) {
			data = "주식에 관심";
		} else if (s.equals("b")) {
			data = "햄버거에 관심";
		} else {
			data = "밥에 관심";
		}

		return data;

	}

	@RequestMapping("/getdata")
	public Object getdata() {
		// [{},{},{}...] - JSON
		JSONArray ja = new JSONArray();
		for (int i = 0; i < 6; i++) {
			JSONObject jo = new JSONObject();
			jo.put("id", "id0" + i);
			jo.put("name", "james" + i);
			jo.put("age", 30 + i);

			Random r = new Random();
			int a = r.nextInt(50) + 1;
			jo.put("age", a);

			ja.add(jo);
		}
		return ja;

	}

	@RequestMapping("/getchart")
	public Object getchart() {
		JSONArray ja = new JSONArray();
		for (int i = 0; i < 15; i++) {
			Random r = new Random();
			int data = r.nextInt(50) + 1;

			ja.add(data);
			// [10,20,33,44,...]
		}

		return ja;
	}
	
	@RequestMapping("/getmarkers")
	public JSONArray getmarkers(String loc) {
		JSONArray ja = new JSONArray();
		if(loc.equals('s')) {
			JSONObject jo1 = new JSONObject();
			jo1.put("content", "<div>카카오1</div>");
			jo1.put("lat", "37.56451692365908");
			jo1.put("lng", "126.91457178013711");
			jo1.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>카카오1</div>");
			jo2.put("lat", "37.56451692365908");
			jo2.put("lng", "126.92457178013711");
			jo2.put("target", "js02");
			ja.add(jo2);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>카카오1</div>");
			jo3.put("lat", "37.57451692365908");
			jo3.put("lng", "126.93457178013711");
			jo3.put("target", "js03");
			ja.add(jo3);
			
		} else if (loc.equals('b')) {
			JSONObject jo1 = new JSONObject();
			jo1.put("content", "<div>카카오1</div>");
			jo1.put("lat", "35.17642453774257");
			jo1.put("lng", " 129.16669784099807");
			jo1.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>카카오1</div>");
			jo2.put("lat", "35.18642453774257");
			jo2.put("lng", " 129.17669784099807");
			jo2.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>카카오1</div>");
			jo3.put("lat", "35.19642453774257");
			jo3.put("lng", " 129.18669784099807");
			jo3.put("target", "js01");
			ja.add(jo1);
			
		} else if (loc.equals('k')) {
			JSONObject jo1 = new JSONObject();
			jo1.put("content", "<div>카카오1</div>");
			jo1.put("lat", "35.16173425533525");
			jo1.put("lng", "126.88758871719189");
			jo1.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>카카오1</div>");
			jo2.put("lat", "35.17173425533525");
			jo2.put("lng", "126.89758871719189");
			jo2.put("target", "js01");
			ja.add(jo1);
			
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>카카오1</div>");
			jo3.put("lat", "35.18173425533525");
			jo3.put("lng", "126.89758871719189");
			jo3.put("target", "js01");
			ja.add(jo1);
			
			
		}
		
		return ja;
	}

}











