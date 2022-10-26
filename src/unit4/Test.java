package unit4;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/10/20 19:36
 * @File: Test.java
 * @Describe: java�ϻ�ʵ����
 * -*- coding: gbk -*-
 */
public class Test {
	public static void main(String[] args) {
		CPU cpu = new CPU();
		cpu.setSpeed(2200);
		HardDisk disk = new HardDisk();
		disk.setAmount(200);
		PC pc = new PC();
		pc.setCPU(cpu);
		pc.setHardDisk(disk);
		pc.show();
	}
}

class CPU {
	private int speed;

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}
}


class HardDisk {
	private int amount;

	public void setAmount(int a) {
		amount = a;
	}

	public int getAmount() {
		return amount;
	}
}


class PC {
	private CPU cpu;

	private HardDisk HD;

	public void setCPU(CPU c) {
		cpu = c;
	}

	public void setHardDisk(HardDisk H) {
		HD = H;
	}

	public void show() {
		System.out.println("CPU���ٶ���:" + cpu.getSpeed());
		System.out.println("Ӳ�̵�������:" + HD.getAmount());
	}
}





