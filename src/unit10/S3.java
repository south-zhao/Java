package unit10;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/12/10 9:48}
 * @File: S3.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
import java.io.*;

import java.util.*;

public class S3 {

    public static void main(String args[]) {

        File file = new File("src\\unit10\\a.txt");

        Scanner sc = null;

        double sum=0;

        int count = 0;

        try {

            sc = new Scanner(file);

            sc.useDelimiter("[^0123456789.]+");

            while(sc.hasNext()){

                try{

                    double price = sc.nextDouble();

                    count++;

                    sum = sum+price;

                    System.out.println(price);

                }

                catch(InputMismatchException exp){

                    String t = sc.next();

                }

            }

            System.out.println("平均价格:"+sum/count);

        }

        catch(Exception exp){

            System.out.println(exp);

        }

    }

}
