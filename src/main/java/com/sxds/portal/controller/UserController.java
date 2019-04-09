package com.sxds.portal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.sxds.portal.dao.UserDao;
import com.sxds.portal.dao.UserMapper;
import com.sxds.portal.model.User;

@Controller
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@PostMapping("login")
	public String login(User user,HttpSession session) {
		boolean flag=userDao.queryUserInfo(user);
		if(flag==true) {
			session.setAttribute("username", user.getUsername());
			session.setAttribute("phonenumber", user.getPhonenumber());
			return "forward:/";
		}
		else
			return "login";
	}
	
}
