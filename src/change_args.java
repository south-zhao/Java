/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/9/21 10:54
 * @File: change_args.java
 * @Describe: �ɱ������Ӧ��
 * -*- coding: gbk -*-
 */
public class change_args {
	public static void main(String[] args) {
		int a;
		a = sum(12, 23, 45, 6432);
		System.out.println(a);
	}
	public static int sum(int... x) {
		int sum = 0;
		for (int i:x) {
			sum = sum +i;
		}
		return sum;
	}
}
