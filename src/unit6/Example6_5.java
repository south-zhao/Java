package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2022/11/9 10:56
 * @File: Example6_5.java
 * @Describe:
 * -*- coding: gbk -*-
 */
public class Example6_5 {
    public static void main(String[] args) {
        KindHello kindHello = new KindHello();
        kindHello.lookHello(new Chinese());
        kindHello.lookHello(new English());
    }
}


interface SpeakHello {
    void speakHello();
}


class Chinese implements SpeakHello {
    @Override
    public void speakHello() {
        System.out.println("�й��˵�ϰ�ߣ��������");
    }
}


class English implements SpeakHello {
    @Override
    public void speakHello() {
        System.out.println("Ӣ������������ô��");
    }
}


class KindHello {
    public void lookHello(SpeakHello hello) {
        hello.speakHello();
    }
}





