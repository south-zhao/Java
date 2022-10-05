/**
 * -*- coding: gbk -*-
 * @author:south(南风)
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
			System.out.printf("请输入一个%d-%d的数字:", min, max);
			int num1 = in.nextInt();
			if(num1 == num) {
				System.out.println("恭喜你猜对了");
				System.out.printf("你猜了%d次，数字为%d", sum, num);
				break;
			}
			else {
				if (num1 > num){
					if(num1 < max)
						max = num1;
					System.out.println("你猜大了");
				}
				else{
					if(num1 > min)
						min = num1;
					System.out.println("你猜小了");
				}
				sum ++;
			}
		}
	}
}
