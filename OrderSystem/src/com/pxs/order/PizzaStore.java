package com.pxs.order;

import java.util.Scanner;

public class PizzaStore {
	public static Pizza getPizza(int choice) {
		Scanner sc = new Scanner(System.in);
		Pizza p = null;
		switch(choice) {
		case 1:
			{
				System.out.println("请录入培根的克数: ");
				int weight = sc.nextInt();
				System.out.println("请录入披萨的大小（英寸）: ");
				int size  = sc.nextInt();
				System.out.println("请录入披萨的价格: ");
				int price = sc.nextInt();
				//将录入的信息封装为培根pizza的对象
				BaconPizza bp = new BaconPizza("培根披萨", size, price, weight);
				p = bp;
			}
			break;
		case 2: 
			{
				System.out.println("请录入你想要加入的水果: ");
				String burdening = sc.next();
				System.out.println("请录入披萨的大小（英寸）: ");
				int size  = sc.nextInt();
				System.out.println("请录入披萨的价格: ");
				int price = sc.nextInt();
				//将录入的信息封装为水果pizza的对象
				FruitPizza fp = new FruitPizza("水果披萨", size, price, burdening);
				p = fp;
			}
			break;
	}
		return p;
		
	}

}
