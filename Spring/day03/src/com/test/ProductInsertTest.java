package com.test;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;
import com.vo.UserVO;

public class ProductInsertTest {

	public static void main(String[] args) {
		ApplicationContext factory =
				new ClassPathXmlApplicationContext("spring.xml");
		
		Service<Integer,ProductVO> service = 
				(Service<Integer, ProductVO>) factory.getBean("pservice");
		
		ProductVO u = new ProductVO("Polo-shirts", 45000, 4.5);
		try {
			service.register(u);
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}
	}

}






