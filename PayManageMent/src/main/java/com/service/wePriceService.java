package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.dao.wePriceDao;
import com.entity.wePrice;

/**
 * 
 * @author Lenovo
 *
 */
@Service
public class wePriceService {
	@Autowired
	wePriceDao dao;
	
	public List<wePrice> find(){
		return dao.find();
	}
	
}
