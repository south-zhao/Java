package unit5;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/10/26 11:15
 * @File: Example5_1.java
 * @Describe: ����̳�
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
		System.out.print("�����ӷ�:");
		int reslut = zhang.add(x, y);
		System.out.printf("%d+%d=%d\n", x, y, reslut);
		UniverStudent geng = new UniverStudent();
		geng.age = 21;
		geng.number = 6609;
		geng.showPeopleMess();
		geng.tellNumber();
		System.out.print("�����ӷ�:");
		reslut = geng.add(x, y);
		System.out.printf("%d+%d=%d\t", x, y, reslut);
		System.out.print("�����˷�:");
		reslut = geng.multi(x, y);
		System.out.printf("%dx%d=%d\n", x, y, reslut);
	}

}


class People {
	int age, leg = 2, hand = 2;
	protected void showPeopleMess() {
		System.out.printf("%d��, %dֻ��, %dֻ��\t", age, leg, hand);
	}
}

class Student extends People {
	int number;
	void tellNumber() {
		System.out.printf("ѧ��:%d\t", number);
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



