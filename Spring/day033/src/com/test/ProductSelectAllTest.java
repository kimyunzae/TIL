package com.test;

import java.util.List; 

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.ProductService;
import com.vo.ProductVO;


public class ProductSelectAllTest {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");

		//Service<String, ProductVO> service = (Service<String, ProductVO>) factory.getBean("pservice");
		
		ProductService service = 
				(ProductService) factory.getBean("pservice");
		
		
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
