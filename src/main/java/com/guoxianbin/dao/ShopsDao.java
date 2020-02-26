package com.guoxianbin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.guoxianbin.entity.Condition;
import com.guoxianbin.entity.Shops;



public interface ShopsDao {

	List<Shops> list(Condition con);

	void addsh(Shops shops);

	void addt(@Param("id")Integer id, @Param("pin")String pin, @Param("zhong")String zhong);

}
