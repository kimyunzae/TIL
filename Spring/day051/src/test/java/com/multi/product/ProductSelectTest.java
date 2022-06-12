package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
public class ProductSelectTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {		
		try {
			CustVO cust = biz.get("id01");
			
			System.out.println(cust); 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
