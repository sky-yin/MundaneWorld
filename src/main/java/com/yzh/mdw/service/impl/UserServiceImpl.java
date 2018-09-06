package com.yzh.mdw.service.impl;

import javax.annotation.Resource;

import com.yzh.mdw.service.IUserService;
import org.springframework.stereotype.Service;

import com.yzh.mdw.dao.IUserDao;
import com.yzh.mdw.pojo.User;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
