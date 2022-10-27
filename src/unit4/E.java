package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/10/27 19:25
 * @File: E.java
 * @Describe:
 * -*- coding: gbk -*-
 */
//class A{
//	double f(int x,double y){
//		return x+y;
//	}
//	int f(int x,int y){
//		return x*y;
//	}
//}
//public class E{
//	public static void main(String[] args){
//		A a = new A();
//		System.out.println(a.f(10,10));//【代码1】
//		System.out.println(a.f(10,10.0));//【代码2】
//	}
//}



//class Fish{
//	int weight = 1;
//}
//class Lake{
//	Fish fish;
//	void setFish(Fish s){
//		fish = s;
//	}
//	void foodFish(int m){
//		fish.weight=fish.weight + m;
//	}
//}

class AAA {
	static {
		System.out.println("我是AAA中的静态块！");
	}
}


public class E{
	static {
		System.out.println("我是最先被执行的静态块！");
	}

	public static void main(String[] args) {
		AAA a = new AAA();
		System.out.println("我在了解静态{static}块");
	}
}

//	public static void main(String[] args){
//		f(1, 2);
//		f(-1, -2, -3, -4);
//		f(9, 7, 6);
//	}
//
//	public static void f(int ... x) {
//		for (int i = 0; i < x.length; i ++) {
//			System.out.println(x[i]);
//		}
//	}