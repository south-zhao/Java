package unit6;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г)
 * @date:2022/11/9 10:28
 * @File: Example6_4.java
 * @Describe: -*- coding: gbk -*-
 */
public class Example6_4 {
    public static void main(String[] args) {
        ComAv c;
        double a = 11.23, b = 22.78;
        c = new A();
        double res = c.average(a, b);
        System.out.println(res);
        c = new B();
        res = c.average(a, b);
        System.out.println(res);
    }
}


interface ComAv {
    public double average(double a, double b);
}


class A implements ComAv {
    @Override
    public double average(double a, double b) {
        double aver = 0;
        aver = (a + b) / 2;
        return aver;
    }
}


class B implements ComAv {
    @Override
    public double average(double a, double b) {
        double aver = 0;
        aver = Math.sqrt(a * b);
        return aver;
    }
}



