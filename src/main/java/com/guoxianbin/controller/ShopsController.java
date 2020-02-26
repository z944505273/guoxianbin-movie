package com.guoxianbin.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guoxianbin.entity.Brand;
import com.guoxianbin.entity.Condition;
import com.guoxianbin.entity.Shops;
import com.guoxianbin.entity.Type;
import com.guoxianbin.service.BrandService;
import com.guoxianbin.service.ShopsService;
import com.guoxianbin.service.TypeService;


@Controller
public class ShopsController {
	@Autowired
	private ShopsService service;
	@Autowired
	private TypeService typeService;
	@Autowired
	private BrandService brandService;
	
	@RequestMapping("list.do")
	public String list(@RequestParam(defaultValue = "1")int pageNum,Model m,Condition con) {
		PageHelper.startPage(pageNum, 2);
		List<Shops> list=service.list(con);
		PageInfo<Shops> page=new PageInfo<Shops>(list);
		m.addAttribute("g", list);
		m.addAttribute("pg", page);
		m.addAttribute("con", con);
		return "list";	
	}
	@RequestMapping("type.do")
	@ResponseBody
	public List<Type> ty(){
		return typeService.type();
	}
	@RequestMapping("brand.do")
	@ResponseBody
	public List<Brand> br(){
		return brandService.br();
	}	
	@RequestMapping("adds.do")
	public String add(Shops shops,@RequestParam("ff")MultipartFile file,String pin,String zhong) throws Exception {
		if(file.getSize()>0) {
			String path="D:\\img";
			String filename = file.getOriginalFilename();
			File file2 = new File(path, filename);
			file.transferTo(file2);
			shops.setPic("/img/"+filename);
		}
		System.out.println(shops);
		//service.add(shops,pin,zhong);
		return "redirect:list.do";
	}
	
	
	
	
	
	
}
