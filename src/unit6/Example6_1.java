package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/11/2 11:24
 * @File: Example6_1.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example6_1 {
	public static void main (String[] args) {
		China z;
		Japan h;
		z = new China();
		h = new Japan();
		z.number = 32 + Computer.Max;
		h.number = 14 + Computer.Max;
		System.out.println("z��ѧ��" + z.number + "��z��ͽ��" + z.f(100));
		System.out.println("h��ѧ��" + h.number + "��h��ͽ��" + h.f(100));
	}
}


// �ӿ�
interface Computer {
	int Max = 46;
	int f(int x);
}


class China implements Computer {
	int number;
	public int f(int x) {
		int sum = 0;
		for (int i = 1;i <= x;i ++) {
			sum = sum + i;
		}
		return sum;
	}
}


class Japan implements Computer {
	int number;
	public int f(int x) {
		return Max + x;
	}
}
