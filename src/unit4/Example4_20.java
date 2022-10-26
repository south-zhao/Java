package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/10/7 21:26
 * @File: Example4_20.java
 * @Describe: 大小写转换
 * -*- coding: gbk -*-
 */
public class Example4_20 {
	public static void main(String[] args) {
		char[] a = {'a', 'b', 'c', 'D', 'E', 'F'};
		for (int i = 0; i < a.length; i++) {
			if (Character.isLowerCase(a[i]))
				a[i] = Character.toUpperCase(a[i]);
			else if (Character.isUpperCase(a[i]))
				a[i] = Character.toLowerCase(a[i]);
		}
		for (char c : a) {
			System.out.print(" " + c);
		}
	}
}
