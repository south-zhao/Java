package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
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
        System.out.println("动物的名字是" + name);
    }
}


class Cat extends Animal {

    void cry() {
        System.out.println("喵喵喵~~");
    }

    @Override
    public String getAnimalName() {
        return "猫";
    }
}


class Dog extends Animal {
    void cry() {
        System.out.println("汪汪汪~~~");
    }

    @Override
    public String getAnimalName() {
        return "狗";
    }
}





