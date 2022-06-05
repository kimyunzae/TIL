package com.multi.user;

import com.multi.frame.Dao;
import com.multi.vo.UserVo;

public class UserDao implements Dao<UserVo> {

	@Override
	public void insert(UserVo v) {
		System.out.println("Insered"+ v);	
		
	}

	
		
}
