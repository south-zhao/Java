package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
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
        System.out.println("中国人的习惯，你吃了吗");
    }
}


class English implements SpeakHello {
    @Override
    public void speakHello() {
        System.out.println("英国人问天气怎么样");
    }
}


class KindHello {
    public void lookHello(SpeakHello hello) {
        hello.speakHello();
    }
}





