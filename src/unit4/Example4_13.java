package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/10/25 15:41
 * @File: Example4_13.java
 * @Describe: 函数方法的重载
 * -*- coding: gbk -*-
 */
public class Example4_13 {
	public static void main(String[] args) {
		Circle1 circle1 = new Circle1();
		circle1.setRadius(196.87);
		Tixing lader = new Tixing(3, 21, 9);
		Student zhang = new Student();
		System.out.println("zhang计算圆的面积:");
		double reslut = zhang.computerArea(circle1);
		System.out.println(reslut);
		System.out.println("zhang计算梯形的面积:");
		reslut = zhang.computerArea(lader);
		System.out.println(reslut);
	}
}


class Circle1 {
	double radius, area;
	void setRadius(double r) {
		radius = r;
	}

	double getArea() {
		area = 3.14 * radius * radius;
		return area;
	}
}


class Tixing {
	double above, bottom, height;
	Tixing(double a, double b, double h) {
		above = a;
		bottom = b;
		height = h;
	}

	double getArea() {
		return (above + bottom) * height / 2;
	}
}


class Student {
	double computerArea(Circle1 c) {
		double area = c.getArea();
		return area;
	}

	double computerArea(Tixing t) {
		double area = t.getArea();
		return area;
	}
}



