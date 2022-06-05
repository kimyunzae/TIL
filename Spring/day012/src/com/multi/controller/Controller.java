package com.multi.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.multi.frame.Service;
import com.multi.vo.UserVo;

public class Controller {

	public static void main(String[] args) {
		
		System.out.println("Spring Start ..");
		ApplicationContext factory =
		new ClassPathXmlApplicationContext("spring.xml");
		
		// IoC (Injection Of Control 제어역행		loosely coupled
		// Service service = new UserService(); 	tightly coupled
		Service service = (Service) factory.getBean("uservice");
		
		UserVo user = new UserVo("id01", "pwd01", "lee");
		service.register(user);
	}

}
