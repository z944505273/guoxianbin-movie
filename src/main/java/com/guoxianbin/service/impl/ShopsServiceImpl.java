package com.guoxianbin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guoxianbin.dao.ShopsDao;
import com.guoxianbin.entity.Condition;
import com.guoxianbin.entity.Shops;
import com.guoxianbin.service.ShopsService;


@Service
public class ShopsServiceImpl implements ShopsService {
	@Autowired
	private ShopsDao shopsDao;

	public List<Shops> list(Condition con) {
		// TODO Auto-generated method stub
		return shopsDao.list(con);
	}

	public void add(Shops shops, String pin, String zhong) {
		shopsDao.addsh(shops);
		shopsDao.addt(shops.getId(),pin,zhong);
	}
}
