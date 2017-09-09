package com.cn.xtzn.dao;

import java.util.List;

import com.cn.xtzn.pojo.User;

public interface UserDao {

	
	public User select1(User user);
	
	public List<User> select2();
}
