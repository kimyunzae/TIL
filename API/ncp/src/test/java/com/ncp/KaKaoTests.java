package com.ncp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ncp.restapi.KakaoAPI;

@SpringBootTest
class KaKaoTests {

	@Autowired
	KakaoAPI kakaoapi;

	@Test
	void contextLoads() throws Exception {
		String result = "";
		result = kakaoapi.kakaolocalapi("fitness");
		System.out.println(result);
		
	}

}
