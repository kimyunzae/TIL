package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ItemVO;

public class ItemSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Service<Integer, ItemVO> service = (Service<Integer, ItemVO>) factory.getBean("iservice");

		List<ItemVO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}

		for (ItemVO ItemVO : list) {
			System.out.println(ItemVO);
		}
	}

}
