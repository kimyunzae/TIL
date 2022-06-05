package com.multi;

public class Controller {

	public static void main(String[] args) {
		Service service = new Service();
		UserVo user = new UserVo("id01","pwd01","lee");
		
		service.register(user);
	}

}
