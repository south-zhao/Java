package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/11/9 11:27
 * @File: Solution6_4.java
 * @Describe: -*- coding: gbk -*-
 */
public class Solution6_4 {
    public static void main(String[] args) {
        Simulator simulator = new Simulator();
        simulator.playSound(new Cat());
        simulator.playSound(new Dog());
    }
}


abstract class Animal {
    abstract void cry();
    abstract String getAnimalName();
}


class Simulator {
    public void playSound(Animal animal) {
        animal.cry();
        String name = animal.getAnimalName();
        System.out.println("�����������" + name);
    }
}


class Cat extends Animal {

    void cry() {
        System.out.println("������~~");
    }

    @Override
    public String getAnimalName() {
        return "è";
    }
}


class Dog extends Animal {
    void cry() {
        System.out.println("������~~~");
    }

    @Override
    public String getAnimalName() {
        return "��";
    }
}





