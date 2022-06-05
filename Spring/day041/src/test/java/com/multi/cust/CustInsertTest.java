package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
public class CustInsertTest {
	
	@Autowired
	CustBiz biz;
	
	@Test
	void contextLoads() {
		CustVO cust = new CustVO("id22", "pwd22", "jee");
		
		try {
			biz.register(cust);
			System.out.println("Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
