package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/10/5 16:38
 * @File: Example4_8.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example4_8 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setR(10);
		Circular circular = new Circular();
		System.out.println("circle 的 引用 :"+circle);
		System.out.println(" 圆 锥 的 bottom 的 引用 :" + circular.bottom) ;
		circular.setH(5);
		circular.setB(circle);
		System.out.println("circle 的 引用 :"+circle);
		System.out.println(" 圆 锥 的 bottom 的 引用 :"+circular.bottom);
		System.out.println(" 圆 锥 的 体积 :"+circular.getV());
		System.out.println(" 修 改 circle 的 半径 ，bottom 的 半径 同样 变化 ");
		circle.setR(20);
		System.out.println ("bottom 的 半径 :"+circular.getBR());
		System.out.println(" 重 新 创建 circle, cirlce 的 引用 将 发 生变 化 ") ;
		circle = new Circle();
		System.out.println ("circle 的 引用 :"+circle);
		System.out.println (" 但 是 不 影响 circular 的bottom 的 引用 ");
		System.out.println (" 圆 锥 的 bottom 的 引用 :" + circular.bottom) ;
	}
}


class Circle {
	double radius, area;
	void setR(double r) {
		radius = r;
	}

	double getR() {
		return radius;
	}

	double getArea() {
		area = 3.14*radius*radius;
		return area;
	}
}


class Circular {
	Circle bottom;
	double height;
	void setB(Circle c) {
		bottom = c;
	}

	void setH(double h) {
		height = h;
	}

	double getV() {
		if (bottom == null)
			return -1;
		else
			return bottom.getArea()*height/3.0;
	}

	double getBR() {
		return bottom.getR();
	}

	void setBR(double r) {
		bottom.setR(r);
	}
}






