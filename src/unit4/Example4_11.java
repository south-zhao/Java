package unit4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/10/5 22:42
 * @File: Example4_11.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example4_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = {12, 34, 9, 23, 45, 6, 45, 90, 123, 19, 34};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("���������������ж��Ƿ���������:");
		int number = in.nextInt();
		int index = Arrays.binarySearch(a, number);
		if (index >= 0)
			System.out.println(number + "��������" + index + "��ͬ");
		else
			System.out.println(number + "�����κ�����ͬ");
	}
}


