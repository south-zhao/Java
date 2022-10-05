/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/9/21 10:54
 * @File: change_args.java
 * @Describe: 可变参数的应用
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
