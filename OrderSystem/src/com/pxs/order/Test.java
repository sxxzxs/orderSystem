package com.pxs.order;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		//选择购买pizza
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择你想要购买的pizza（1.培根披萨 2.水果披萨）: ");
		int choice = sc.nextInt();
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
					System.out.println(bp.showPizza());;
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
					System.out.println(fp.showPizza());
				}
			break;
		}

	}

}
