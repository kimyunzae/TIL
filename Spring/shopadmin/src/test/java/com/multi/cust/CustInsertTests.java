package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;
import com.multi.vo.ProductVO;

@SpringBootTest
class CustInsertTests {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		//(NULL, 'levis',10000,curdate(),11,'a.jpg')
		CustVO obj = new CustVO("id02","kim","seoul","pwd02");
		try {
			biz.register(obj);
			System.out.println("Registered ...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


