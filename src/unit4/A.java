package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г)
 * @date:2022/10/27 19:33
 * @File: A.java
 * @Describe:
 * -*- coding: gbk -*-
 */
class B{
	int n;
	static int sum = 0;
	void setN(int n) {
		this.n = n;
	}

	int getSum() {
		for (int i = 1; i <= n; i++)
			sum = sum + i;
		return sum;
	}
}
public class A{
	public static void main(String[] args){
		B b1 = new B();
		B b2 = new B();
		b1.setN(3);
		b2.setN(5);
		int s1 = b1.getSum();
		int s2 = b2.getSum();
		System.out.println(s1 + s2);
	}
}

//	int x = 100, y = 200;
//	public void setX(int x){
//		x = x;
//	}
//	public void setY(int y){
//		this.y=y;
//	}
//	public int getXYSum(){
//		return x+y;
//	}
