package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/11/9 10:10
 * @File: Example6_2.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example6_2 {
    public static void main(String[] args) {
        ShowMessage ms;
        ms = new TV();
        ms.show("������");
        ms = new PC();
        ms.show("���뱼��5008PC��");
    }
}


interface ShowMessage {
    void show(String a);
}


class TV implements ShowMessage {
    @Override
    public void show(String a) {
        System.out.println(a + "���ӻ�");
    }
}


class PC implements ShowMessage {
    @Override
    public void show(String a) {
        System.out.println(a);
    }
}
