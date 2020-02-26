package com.guoxianbin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guoxianbin.dao.BrandDao;
import com.guoxianbin.entity.Brand;
import com.guoxianbin.service.BrandService;


@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	private BrandDao brandDao;

	public List<Brand> br() {
		// TODO Auto-generated method stub
		return brandDao.br();
	}
}
