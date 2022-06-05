package com.multi.controller;

import com.multi.frame.Service;
import com.multi.user.UserService;
import com.multi.vo.UserVo;

public class Controller {

	public static void main(String[] args) {
		Service service = null;
		
		service = new UserService();
		
		UserVo user = new UserVo("id01", "pwd01", "lee");
		service.register(user);
	}

}
