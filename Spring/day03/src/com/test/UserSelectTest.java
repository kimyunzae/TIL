package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;
import com.vo.UserVO;

public class UserSelectTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Service<String, UserVO> service = (Service<String, UserVO>) factory.getBean("uservice");

		UserVO user = null;
		try {
			user = service.get("id01");
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}

		System.out.println(user);
	}

}
