package com.sxds.portal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.sxds.portal.model.Order;

public interface OrderMapper {
	@Select("select * from order_info where id=#{id}")
	public List<Order> queryBy();
	@Select("select counter(*) from order_info")
	public int queryCounter();
	@Select("insert into order_info(id,date,time,user_id,product_id,counter) value(#{id},#{date},#{time},#{user_id},#{product_id},#{counter})")
	public List<Order> insertOne(Order obj);
	@Select("update order_info set counter=#{counter} where product_id=#{product_id} and user_id=#{user_id}")
	public List<Order> updateOne(Order obj);
}
