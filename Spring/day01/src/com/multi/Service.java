package com.multi;

public class Service {
	Dao dao;

	public Service() {
		dao = new Dao();

	}

	public void register(UserVo user) {
		//Security, Log, Transaction 
		dao.insert(user);
	}	
}
