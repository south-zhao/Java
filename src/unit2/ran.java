package unit2;

import java.util.Random;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2023/6/10 18:30
 * @File: Java
 * @Describe: -*- coding: gbk -*-
 */
public class ran {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};//1.定义数组表示奖池
        int[] newArr = new int[arr.length];//2.定义数组用于存储抽奖的结果
        Random r = new Random();//3.抽奖
        for (int i = 0; i < 5; ) {//因为有5个奖项，这里要循环5次
            int randomIndex = r.nextInt(arr.length);//获取随机索引
            int prize = arr[randomIndex];//获取奖项
            boolean flag = win(newArr, prize);//判断当前的奖项是否存在，如果存在则重新抽奖，如果不存在，就表示有效奖项
            if (!flag) {
                newArr[i] = prize;//把当前的奖项添加到newArr中
                i++;//添加完毕之后，移动索引
            }
        }
        for (int i = 0; i < newArr.length; i++) {//4.遍历newArr
            System.out.println(newArr[i]);
        }
    }

    public static boolean win(int[] arr, int prize) {//定义一方法判断prize在数组中是否存在
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;//存在：true
            }
        }
        return false;//不存在：false
    }
}