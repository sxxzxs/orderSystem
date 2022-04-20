package com.pxs.order;

public class BaconPizza extends Pizza {
	//属性
	private int weight;

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//构造器
	public BaconPizza() {
		
	}

	public BaconPizza(String name, int size, int price,int weight) {
		super(name, size, price);
		this.weight = weight;
	}
	

}
