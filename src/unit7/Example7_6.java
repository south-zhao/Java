package unit7;
import java.util.Scanner;
/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/11/24 19:20}
 * @File: Example7_6.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example7_6 {
    public static void main(String[] args) {
        int [] score = {-120, 98, 89, 120, 99};
        int sum = 0;
        for (int n:score) {
            assert n>=0: "负数不能为成绩";
            sum = n + sum;
        }
        System.out.println("总成绩为:" + sum);
    }
}
