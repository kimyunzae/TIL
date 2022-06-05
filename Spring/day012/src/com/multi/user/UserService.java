package com.multi.user;

import com.multi.frame.Dao;
import com.multi.frame.Service;
import com.multi.vo.UserVo;

public class UserService implements Service<UserVo> {

	Dao<UserVo> dao;
	
	
	public Dao<UserVo> getDao() {
		return dao;
	}

	public void setDao(Dao<UserVo> dao) {
		this.dao = dao;
	}
	
	@Override
	public void register(UserVo v) {
		dao.insert(v);
		
	}

}
