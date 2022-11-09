package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2022/11/9 10:10
 * @File: Example6_2.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example6_2 {
    public static void main(String[] args) {
        ShowMessage ms;
        ms = new TV();
        ms.show("长城牌");
        ms = new PC();
        ms.show("联想奔月5008PC机");
    }
}


interface ShowMessage {
    void show(String a);
}


class TV implements ShowMessage {
    @Override
    public void show(String a) {
        System.out.println(a + "电视机");
    }
}


class PC implements ShowMessage {
    @Override
    public void show(String a) {
        System.out.println(a);
    }
}
