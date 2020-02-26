package com.guoxianbin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.guoxianbin.entity.Type;


public interface TypeDao {
	@Select("select * from type")
	List<Type> type();
}
