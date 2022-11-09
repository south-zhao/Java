package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
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
        System.out.println(adver.getName() + "����:");
        adver.showa();
    }
}


class White implements Adver {
    @Override
    public void showa() {
        System.out.println("�ɻ��е�ս����");
    }

    @Override
    public String getName() {
        return "����";
    }
}


class Black implements Adver {
    @Override
    public void showa() {
        System.out.println("�ϴ��ǵ�");
    }

    @Override
    public String getName() {
        return "����";
    }
}










