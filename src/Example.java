//-*- coding: gbk -*-
//@author:south(�Ϸ�)
//@date:2022/9/8 17:40
//@File: Example.java
import java.util.Scanner;

public class Example {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("����������:");
        String name = in.nextLine();
        byte b = 22;
        int n = 129;
        float f = 12345.345f;
        double d = 12345.123434;
        System.out.println("b = " + b);
        System.out.println("n = " + n);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        b = (byte)n;
        f = (float)d;
        System.out.println("b = " + b);
        System.out.println("f = " + f);
        System.out.println(name);
    }
}
