package com.guoxianbin.service;

import java.util.List;

import com.guoxianbin.entity.Condition;
import com.guoxianbin.entity.Shops;



public interface ShopsService {

	List<Shops> list(Condition con);

	void add(Shops shops, String pin, String zhong);

}
