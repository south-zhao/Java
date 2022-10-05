package unit4;

import org.jetbrains.annotations.NotNull;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/9/24 16:17
 * @File: Example4_7.java
 * @Describe: 使用类完成一些简单的操作
 * -*- coding: gbk -*-
 */
public class Example4_7 {
	public static void main(String[] args) throws InterruptedException {
		Battery battery = new Battery(100);
		System.out.println("南孚电池现在的电量:" + battery.ele);
		Radio radio = new Radio();
		System.out.println("收音机现在开始使用电池");
		int[] a = new int[10];
		for (int i:a) {
			Thread.sleep(1000);
			radio.open(battery);
			System.out.println("南孚电池现在的电量:" + battery.ele);
			if (battery.ele <= 20 && battery.ele > 0) {
				System.out.println("电量低于20%，请及时充电");
			}
			else if (battery.ele == 0) {
				System.out.println("电池没电，收音机已关机");
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
