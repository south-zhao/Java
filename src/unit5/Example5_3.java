package unit5;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/11/2 10:13
 * @File: Example5_3.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example5_3 {
	public static void main(String[] args) {
		CheapGoods cheapGoods = new CheapGoods();
		cheapGoods.newSetWeight(198);
		System.out.println("����cheapGoods��weight��ֵ��:" + cheapGoods.weight);
		System.out.println("����cheapGoodsʹ���µļ��㷽ʽ:" + cheapGoods.newGetPrice());
		cheapGoods.oldSetWeight(198.987);
		System.out.println("����cheapGoodsʹ�þɵļ��㷽ʽ:" + cheapGoods.oldGetPrice());
	}
}


class Goods {
	public double weight;
	public void oldSetWeight(double a) {
		weight = a;
		System.out.println("double�͵�weight=" + weight);
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
		System.out.println("int�͵�weight=" + weight);
	}

	public double newGetPrice() {
		double price = weight * 10;
		return price;
	}
}

