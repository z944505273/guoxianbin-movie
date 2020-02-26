package com.guoxianbin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guoxianbin.dao.TypeDao;
import com.guoxianbin.entity.Type;
import com.guoxianbin.service.TypeService;


@Service
public class TypeServiceImpl implements TypeService {
	@Autowired
	private TypeDao typeDao;

	public List<Type> type() {
		// TODO Auto-generated method stub
		return typeDao.type();
	}
}
