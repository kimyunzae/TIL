package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemSelectTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Service<Integer, ItemVO> service = (Service<Integer, ItemVO>) factory.getBean("iservice");

		ItemVO product = null;
		try {
			product = service.get(1002);
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}

		System.out.println(product);
	}

}
