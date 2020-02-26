package com.guoxianbin.entity;

import java.util.List;

public class Shops {
	private Integer id;
	private String name;
	private String ename;
	private Integer size;
	private Integer price;
	private Integer num;
	private String bq;
	private String pic;
	List<Type> type;
	List<Brand> brand;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getBq() {
		return bq;
	}
	public void setBq(String bq) {
		this.bq = bq;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public List<Type> getType() {
		return type;
	}
	public void setType(List<Type> type) {
		this.type = type;
	}
	public List<Brand> getBrand() {
		return brand;
	}
	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}
	public Shops(Integer id, String name, String ename, Integer size, Integer price, Integer num, String bq, String pic,
			List<Type> type, List<Brand> brand) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.size = size;
		this.price = price;
		this.num = num;
		this.bq = bq;
		this.pic = pic;
		this.type = type;
		this.brand = brand;
	}
	public Shops() {
		super();
	}
	@Override
	public String toString() {
		return "Shops [id=" + id + ", name=" + name + ", ename=" + ename + ", size=" + size + ", price=" + price
				+ ", num=" + num + ", bq=" + bq + ", pic=" + pic + ", type=" + type + ", brand=" + brand + "]";
	}
	
	
}
