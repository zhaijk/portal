package com.sxds.portal.model;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户信息
 * @author Administrator
 *
 */
public class User {
	
	private long id;
	private String username;	//用户名
	private String password;	//密码
	private String name;		//姓名
	private int age;			//年龄
	private int sex;			//性别
	private String address;		//地址
	private String phonenumber;	//电话
	private String email;		//电子邮件
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Map<String ,Object> toHashMap(){
		Map<String ,Object> obj=new HashMap<String ,Object>();
		obj.put("name", name);
		obj.put("age", age);
		obj.put("sex", sex);
		//obj.put("flag", flag);
		return obj;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
