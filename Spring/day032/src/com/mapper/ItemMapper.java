package com.mapper;

import java.util.List;
import java.util.Map;

import com.vo.ItemVO; 

public interface ItemMapper {

	public void insert(Object obj) throws Exception;
	public void delete(Object obj) throws Exception;
	public void update(Object obj) throws Exception;
	
	public ItemVO select(Object obj) throws Exception;
	public List<ItemVO> selectall() throws Exception;
	public List<ItemVO> searchname(String name) throws Exception;
	
	public List<ItemVO> searchprice(Map<String,Integer> map)  throws Exception;
	public List<ItemVO> searchdate(String date) throws Exception;
}
