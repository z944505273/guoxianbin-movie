package com.guoxianbin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.guoxianbin.entity.Brand;



public interface BrandDao {
	@Select("select * from brand")
	List<Brand> br();

}
