package com.sxds.portal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.sxds.portal.model.Supplier;

public interface SupplierMapper {
	@Select("select name,fullname,address,type,info from supplier_info where name like #{name}||'%' or address like #{address}||'%' or fullname like #{fullname} ||'%' ")
	public List<Supplier> queryBy();
	@Select("select counter(name) from supplier_info")
	public int queryCounter();
	@Select("insert into supplier_info(name,fullname,address,type,info) value(#{name},#{fullname},#{address},#{type},#{info})")
	public List<Supplier> insertOne(Supplier obj);
	@Select("update supplier_info set name=#{name},fullname=#{fullname},address=#{address},info=#{info},type=#{type} where name=#{name}")
	public List<Supplier> updateOne(Supplier obj);
}
