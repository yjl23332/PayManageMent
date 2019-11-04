package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.entity.wePrice;

/**
 * 水电价格dao层
 * @author Lenovo
 *
 */
@Mapper
public interface wePriceDao {
	public List<wePrice> find();
	public int updates(wePrice wepice);
}
