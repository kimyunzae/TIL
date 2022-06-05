package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.service.UserService;
import com.vo.ProductVO;
import com.vo.UserVO;

public class UserSearchTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		UserService service = 
				(UserService) factory.getBean("uservice");

		List<UserVO> list = null;
		try {
			list = service.searchname("이");
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}

		for (UserVO userVO : list) {
			System.out.println(userVO);
		}

	}

}
