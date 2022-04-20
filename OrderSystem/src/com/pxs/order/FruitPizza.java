package com.pxs.order;

public class FruitPizza extends Pizza{
	//属性
	private String burdening;

	public String getBurdening() {
		return burdening;
	}

	public void setBurdening(String burdening) {
		this.burdening = burdening;
	}

	//构造器
	public FruitPizza() {
		
	}

	public FruitPizza(String name, int size, int price,String burdening) {
		super(name, size, price);
		this.burdening = burdening;
	}

	
	

}
