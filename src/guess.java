/**
 * -*- coding: gbk -*-
 * @author:south(�Ϸ�)
 * @date:2022/9/15 19:45
 * @File: guess.java
 * -*- coding: gbk -*-
 */
import java.util.Scanner;
import java.util.Random;

public class guess {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int num = r.nextInt(100);
		int min = 1;
		int max = 100;
		int sum = 1;
		while (true){
			System.out.printf("������һ��%d-%d������:", min, max);
			int num1 = in.nextInt();
			if(num1 == num) {
				System.out.println("��ϲ��¶���");
				System.out.printf("�����%d�Σ�����Ϊ%d", sum, num);
				break;
			}
			else {
				if (num1 > num){
					if(num1 < max)
						max = num1;
					System.out.println("��´���");
				}
				else{
					if(num1 > min)
						min = num1;
					System.out.println("���С��");
				}
				sum ++;
			}
		}
	}
}
