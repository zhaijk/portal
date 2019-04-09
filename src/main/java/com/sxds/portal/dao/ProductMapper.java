package com.sxds.portal.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import com.sxds.portal.model.Product;


public interface ProductMapper {
	
	@Select("select * from product_info where name=#{name} and type=#{type}")
	public List<Product> queryBy();
	@Select("select counter(*) from product_info")
	public List<Product> queryCounter();
	@Select("insert into product_info(id,name,type,description,price,stocks,supplier,address,photopath) value(#{id},#{name},#{type},#{description},#{price},#{stocks},#{supplier},#{address},#{photopath})")
	public List<Product> insertOne(Product obj);
	@Select("update product_info set name=#{name},type=#{type},description=#{description},price=#{price},stocks=#{stocks},supplier=#{supplier}  where type=#{type}")
	public List<Product> updateOne(Product obj);
}
