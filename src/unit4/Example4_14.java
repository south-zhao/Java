package unit4;

import java.util.Objects;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/10/25 15:56
 * @File: Example4_14.java
 * @Describe: this��ʹ��
 * -*- coding: gbk -*-
 */
public class Example4_14 {
	public static void main(String[] args) {
		People peo1 = new People("djajkd");
		People peo2 = new People("sw");
		People peo3 = new People("nd");
	}
}


class People {
	int leg;
	int hand;
	static int num;
	String name;
	People(String s) {
		this.name = s;
		this.init();
		if (Objects.equals(s, "sw"))
			this.leg = 1;
		System.out.println(name + "��" + hand + "ֻ��" + leg + "����" + num);
	}

	void init() {
		leg = 2;
		hand = 2;
		People.num ++;
	}
}

