package unit4;

import org.jetbrains.annotations.NotNull;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/9/24 16:17
 * @File: Example4_7.java
 * @Describe: ʹ�������һЩ�򵥵Ĳ���
 * -*- coding: gbk -*-
 */
public class Example4_7 {
	public static void main(String[] args) throws InterruptedException {
		Battery battery = new Battery(100);
		System.out.println("���ڵ�����ڵĵ���:" + battery.ele);
		Radio radio = new Radio();
		System.out.println("���������ڿ�ʼʹ�õ��");
		int[] a = new int[10];
		for (int i:a) {
			Thread.sleep(1000);
			radio.open(battery);
			System.out.println("���ڵ�����ڵĵ���:" + battery.ele);
			if (battery.ele <= 20 && battery.ele > 0) {
				System.out.printf("��������%d%%���뼰ʱ���\n", battery.ele);
			}
			else if (battery.ele == 0) {
				System.out.println("���û�磬�������ѹػ�");
			}
		}
	}
}

class Battery {
	int ele;
	Battery(int amount) {
		ele = amount;
	}
}

class Radio {
	public void open(Battery battery) {
		battery.ele = battery.ele - 10;
	}
}
