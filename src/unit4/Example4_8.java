package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
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
		System.out.println("circle �� ���� :"+circle);
		System.out.println(" Բ ׶ �� bottom �� ���� :" + circular.bottom) ;
		circular.setH(5);
		circular.setB(circle);
		System.out.println("circle �� ���� :"+circle);
		System.out.println(" Բ ׶ �� bottom �� ���� :"+circular.bottom);
		System.out.println(" Բ ׶ �� ��� :"+circular.getV());
		System.out.println(" �� �� circle �� �뾶 ��bottom �� �뾶 ͬ�� �仯 ");
		circle.setR(20);
		System.out.println ("bottom �� �뾶 :"+circular.getBR());
		System.out.println(" �� �� ���� circle, cirlce �� ���� �� �� ���� �� ") ;
		circle = new Circle();
		System.out.println ("circle �� ���� :"+circle);
		System.out.println (" �� �� �� Ӱ�� circular ��bottom �� ���� ");
		System.out.println (" Բ ׶ �� bottom �� ���� :" + circular.bottom) ;
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






