package unit2;

import java.util.Random;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * @date:2023/6/10 18:30
 * @File: Java
 * @Describe: -*- coding: gbk -*-
 */
public class ran {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};//1.���������ʾ����
        int[] newArr = new int[arr.length];//2.�����������ڴ洢�齱�Ľ��
        Random r = new Random();//3.�齱
        for (int i = 0; i < 5; ) {//��Ϊ��5���������Ҫѭ��5��
            int randomIndex = r.nextInt(arr.length);//��ȡ�������
            int prize = arr[randomIndex];//��ȡ����
            boolean flag = win(newArr, prize);//�жϵ�ǰ�Ľ����Ƿ���ڣ�������������³齱����������ڣ��ͱ�ʾ��Ч����
            if (!flag) {
                newArr[i] = prize;//�ѵ�ǰ�Ľ�����ӵ�newArr��
                i++;//������֮���ƶ�����
            }
        }
        for (int i = 0; i < newArr.length; i++) {//4.����newArr
            System.out.println(newArr[i]);
        }
    }

    public static boolean win(int[] arr, int prize) {//����һ�����ж�prize���������Ƿ����
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;//���ڣ�true
            }
        }
        return false;//�����ڣ�false
    }
}