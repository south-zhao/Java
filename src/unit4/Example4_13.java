package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/10/25 15:41
 * @File: Example4_13.java
 * @Describe: ��������������
 * -*- coding: gbk -*-
 */
public class Example4_13 {
	public static void main(String[] args) {
		Circle1 circle1 = new Circle1();
		circle1.setRadius(196.87);
		Tixing lader = new Tixing(3, 21, 9);
		Student zhang = new Student();
		System.out.println("zhang����Բ�����:");
		double reslut = zhang.computerArea(circle1);
		System.out.println(reslut);
		System.out.println("zhang�������ε����:");
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



