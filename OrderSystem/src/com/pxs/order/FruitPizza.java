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

	//重写父类showPizza方法
	@Override
	public String showPizza() {
		// TODO Auto-generated method stub
		return super.showPizza()+"\n你要加入的水果: "+burdening;
	}
	

}
