package com.multi.product;

import org.junit.jupiter.api.Test; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.ProductBiz;
import com.multi.vo.ProductVO;

@SpringBootTest
public class ProductInsertTest {
	
	@Autowired
	ProductBiz pbiz;
	
	@Test
	void contextLoads() {
		ProductVO product = new ProductVO(0, "Socks", 10000, null, 2.3);
		
		try {
			pbiz.register(product);
			System.out.println("Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
