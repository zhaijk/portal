package com.sxds.portal.model;
/**
 *  供应商信息
 * @author Administrator
 *
 */
public class Supplier {

	private long id;
	private String name;		//供应商名称
	private String fullname;	//全名
	private String address;		//地址
	private int type;			//类型
	private String  info;		//相关信息
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
