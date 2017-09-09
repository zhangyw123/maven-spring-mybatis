package com.cn.xtzn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cn.xtzn.dao.UserDao;
import com.cn.xtzn.pojo.User;
import com.cn.xtzn.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource
	private UserDao userDao;
	
	
	public User select1(User user) {
		return userDao.select1(user); 
	}


	public List<User> select2() {
		
		return userDao.select2();
	}

}
