package unit7;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * {@code @Date:2022/11/24 18:58}
 * @File: Example7_4.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example7_4 {
    public static void main(String[] args) {
        int n = 0, m = 0, t = 1000;
        try {
            m = Integer.parseInt("8888");
            n = Integer.parseInt("ab89");
            t = 7777;
        }
        catch (NumberFormatException e) {
            System.out.println("�����쳣:" + e.getMessage());
        }
        System.out.println("n=" + n + ",m=" + m + ",t=" + t);
        try {
            System.out.println("�����׳��쳣");
            throw new java.io.IOException("���ǹ����");
        }
        catch (java.io.IOException e) {
            System.out.println("�����쳣:" + e.getMessage());
        }
    }
}
