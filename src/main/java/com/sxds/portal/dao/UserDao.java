package com.sxds.portal.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sxds.portal.model.User;

@Repository
public class UserDao {

	@Autowired
	private UserMapper  userMapper;
	
	public boolean queryUserInfo(User obj) {
		List<User> objs=userMapper.queryBy(obj);
		if(objs.size()>=1) {
			return true;
		}
		return false;
	}
}
