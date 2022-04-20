package com.pxs.order;

public class Pizza {
	//属性
	private String name;//名称
	private int size;//大小
	private int price;//价格
	
	//方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//展示pizza信息
	public String showPizza() {
		return "披萨的名字是: "+ name +"\n披萨的大小是: "+ size +"寸\n披萨的价格是: "+price+" 元";
	}
	
	//构造器
	public Pizza() {
		
	}
	public Pizza(String name, int size, int price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}
		
}
