package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.vo.ItemVO;

public class ItemDateSearchTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		// Service<Integer, ItemVO> service = (Service<Integer, ItemVO>) factory.getBean("iservice");

		ItemService service = (ItemService) factory.getBean("iservice");
		
		
		List<ItemVO> list = null;
		try {
			list = service.searchdate("2020-05-31");
			
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}

		for (ItemVO ItemVO : list) {
			System.out.println(ItemVO);
		}
	}

}
