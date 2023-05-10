//-*- coding: gbk -*-
//@author:south(南风)
//@date:2022/9/8 17:40
//@File: Example.java
import java.util.Scanner;

public class Example {
    public static void main (String[] args){
        int n = 5;
        int a;
        a = fe(n);
        System.out.println(a);
    }

    public static int fe(int n) {
        if (n == 1)
            return 1;
        else
            return fe(n-1) * n;
    }
}
