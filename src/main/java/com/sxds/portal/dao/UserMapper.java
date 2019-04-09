package com.sxds.portal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sxds.portal.model.User;

public interface UserMapper {
	@Select("select * from user_info where name=#{name} or email=#{email} or phonenumber=#{phonenumber}")
	public List<User> queryBy(User obj);
	@Select("select counter(*) from user_info")
	public List<User> queryCounter();
	@Select("insert into user_info(username,password,name,email,phonenumber) value(#{username},#{password},#{name},#{email},#{phonenumber})")
	public List<User> insertOne(User obj);
	@Select("update user_info set email=#{email},password=#{password},phonenumber=#{phonenumber} where name=#{name}")
	public List<User> updateOne(User obj);
}
