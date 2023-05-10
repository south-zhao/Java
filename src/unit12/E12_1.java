package unit12;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/12/15 16:06}
 * @File: E12_1.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class E12_1 {
	public static void main(String[] args) {
		SpeakE speakE;
		SpeakC speakC;
		speakE = new SpeakE();
		speakC = new SpeakC();
		speakE.start();
		speakC.start();
		for (int i = 1; i <= 15; i++) {
			System.out.print("主人" + i + " ");
		}
	}
}

class SpeakE extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("大象" + i + " ");
		}
	}
}

class SpeakC extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.print("轿车" + i + " ");
		}
	}
}

