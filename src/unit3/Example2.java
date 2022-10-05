package unit3;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/9/29 19:24
 * @File: Example2.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example2 {
	public static void main(String[] args) {
		for (int i = 2; i <= 1000; i++) {
			int sum = 0;
			for (int j = 1; j <= i / 2;j ++) {
				if (i % j == 0){
					sum = sum + j;
				}
			}
			if (sum == i)
				System.out.println(i + "是完数");
		}
	}
}
