package com.multi.main;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.biz.MainBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustCountTests {
	
	@Autowired
	MainBiz biz;
	
	@Test
	void contextLoads() {
		int count;
		try {
			count = biz.getCustCnt();
			System.out.println(count);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


