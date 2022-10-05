package unit3;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г)
 * @date:2022/9/29 19:48
 * @File: Example3.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example3 {
	public static void main(String[] args) {
		long total = 0;
		for (int j = 1; j <= 10; j++) {
			long sum = 0;
			for (int i = 0; i < j; i++) {
				sum = (long) (8 * Math.pow(10, i) + sum);
			}
			total = total + sum;
		}
		System.out.println(total);
	}
}
