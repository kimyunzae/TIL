package com.multi.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
public class ProductUpdateTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id22", "pwd23", "jhonny");
		
		try {
			biz.modify(cust);
			System.out.println("Updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
