package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ItemService;
import com.vo.ItemVO;

public class ItemSearchTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		
		ItemService service = 
				(ItemService) factory.getBean("iservice");
			
		List<ItemVO> list = null;
		try {
			list = service.searchname("5");
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}

		for (ItemVO ItemVO : list) {
			System.out.println(ItemVO);
		}
	}

}
