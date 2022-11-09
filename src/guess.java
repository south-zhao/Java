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
		Random rnd = new Random();
		int[] arr = new int[10];
		for (int i = 0;i < 10; i++) {
			arr[i] = rnd.nextInt(99);
		}
		for (int i=0;i<arr.length; i ++) {
			for (int j = 0; j < arr.length - 1; j ++) {
				if (arr[j] < arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		for (int i = 0;i<arr.length; i ++) {
			System.out.print(arr[i] + " ");
		}
	}
}

//public class guess {
//	public static void main(String[] args) {
//		for (int i=1;i<=10;i++) {
//			for (int j=1;j<i;j++){
//				System.out.print(" ");
//			}
//			for (int j =1;j<12-2 * i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}


//public class guess {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Random rnd = new Random();
//		int rndNum = rnd.nextInt(100);
//		while (true){
//			System.out.printf("请输入一个%d-%d的数字:", min, max);
//			int num1 = sc.nextInt();
//			if(num1 > rndNum) {
//				System.out.println("你猜大了");
//			}
//			else if(num1 < rndNum){
//					System.out.println("你猜小了");
//				}
//			else {
//				System.out.println("你猜对了");
//				break;
//			}
//		}
//	}
//}
