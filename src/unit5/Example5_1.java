package unit5;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/10/26 11:15
 * @File: Example5_1.java
 * @Describe: 子类继承
 * -*- coding: gbk -*-
 */
public class Example5_1 {
	public static void main(String[] args) {
		Student zhang = new Student();
		zhang.age = 17;
		zhang.number = 100101;
		zhang.showPeopleMess();
		zhang.tellNumber();
		int x = 9, y = 29;
		System.out.print("会做加法:");
		int reslut = zhang.add(x, y);
		System.out.printf("%d+%d=%d\n", x, y, reslut);
		UniverStudent geng = new UniverStudent();
		geng.age = 21;
		geng.number = 6609;
		geng.showPeopleMess();
		geng.tellNumber();
		System.out.print("会做加法:");
		reslut = geng.add(x, y);
		System.out.printf("%d+%d=%d\t", x, y, reslut);
		System.out.print("会做乘法:");
		reslut = geng.multi(x, y);
		System.out.printf("%dx%d=%d\n", x, y, reslut);
	}

}


class People {
	int age, leg = 2, hand = 2;
	protected void showPeopleMess() {
		System.out.printf("%d岁, %d只脚, %d只手\t", age, leg, hand);
	}
}

class Student extends People {
	int number;
	void tellNumber() {
		System.out.printf("学号:%d\t", number);
	}

	int add(int x, int y) {
		return x + y;
	}
}

class UniverStudent extends Student {
	int multi(int x, int y) {
		return x * y;
	}
}



