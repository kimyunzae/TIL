package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.frame.Service;
import com.vo.ProductVO;
import com.vo.UserVO;

public class ProductSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		Service<Integer, ProductVO> service = (Service<Integer, ProductVO>) factory.getBean("pservice");

		List<ProductVO> list = null;
		try {
			list = service.get();
		} catch (Exception e) {
			System.out.println("Error ...");
			e.printStackTrace();
		}

		for (ProductVO ProductVO : list) {
			System.out.println(ProductVO);
		}
	}

}