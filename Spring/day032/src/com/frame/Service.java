package com.frame;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.vo.ItemVO;

public interface Service<K,V> {
	public void register(V v) throws Exception;
	public void remove(K k) throws Exception;
	public void modify(V v) throws Exception;
	public V get(K k) throws Exception;
	public List<V> get() throws Exception;
	
	List<ItemVO> searchprice(Map<String,Integer> map) throws Exception;
	List<ItemVO> searchdate(String date) throws Exception;
}
