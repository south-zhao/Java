package unit3;
import java.util.Scanner;
/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/9/29 19:05
 * @File: Example1.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example1 {
	public static void main(String[] args) {
		System.out.println("��������Ҫ����Ľ׳˺͵Ľ׳�����");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int total = 0;
		while (k > 0) {
			int sum = 1;
			for (int i = 1; i <= k; i++) {
				sum = sum * i;
			}
			total += sum;
			k--;
		}
		System.out.println("�����" + total);
	}
}
