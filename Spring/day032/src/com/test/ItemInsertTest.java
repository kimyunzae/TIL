package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,ItemVO> service = 
				(Service<Integer, ItemVO>) factory.getBean("iservice");
		
		ItemVO u = new ItemVO("Polo-shirts", 45000, "pants6.jpg");
		try {
			service.register(u);
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}
	}

}
