package unit5;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/11/2 10:13
 * @File: Example5_3.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example5_3 {
	public static void main(String[] args) {
		CheapGoods cheapGoods = new CheapGoods();
		cheapGoods.newSetWeight(198);
		System.out.println("对象cheapGoods的weight的值是:" + cheapGoods.weight);
		System.out.println("对象cheapGoods使用新的计算方式:" + cheapGoods.newGetPrice());
		cheapGoods.oldSetWeight(198.987);
		System.out.println("对象cheapGoods使用旧的计算方式:" + cheapGoods.oldGetPrice());
	}
}


class Goods {
	public double weight;
	public void oldSetWeight(double a) {
		weight = a;
		System.out.println("double型的weight=" + weight);
	}

	public double oldGetPrice() {
		double price  = weight * 10;
		return price;
	}
}


class CheapGoods extends Goods {
	public int weight;
	public void newSetWeight(int w) {
		weight = w;
		System.out.println("int型的weight=" + weight);
	}

	public double newGetPrice() {
		double price = weight * 10;
		return price;
	}
}

