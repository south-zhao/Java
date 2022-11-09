package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/11/9 11:11
 * @File: Example6_6.java
 * @Describe: -*- coding: gbk -*-
 */
public class Example6_6 {
    public static void main(String[] args) {
        Advert advert = new Advert();
        advert.show(new White());
        advert.show(new Black());
    }
}


interface Adver {
    public void showa();
    public String getName();
}


class Advert {
    public void show(Adver adver) {
        System.out.println(adver.getName() + "广告词:");
        adver.showa();
    }
}


class White implements Adver {
    @Override
    public void showa() {
        System.out.println("飞机中的战斗机");
    }

    @Override
    public String getName() {
        return "白云";
    }
}


class Black implements Adver {
    @Override
    public void showa() {
        System.out.println("老大是跌");
    }

    @Override
    public String getName() {
        return "黑土";
    }
}










