package unit10;
import java.io.*;
/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�) {@code @Date:2022/11/30 11:03}
 * @File: Example10_1.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_1 {
    public static void main(String[] args) {
        File f = new File("src\\sql.java");
//        File f = new File("src\\sql.java");
        System.out.println(f.getName() + "�ǿɶ�����:" + f.canRead());
        System.out.println(f.getName() + "���ȵ�:" + f.length());
        System.out.println(f.getName() + "����·��:" + f.getAbsolutePath());
        File file = new File("1.txt");
        System.out.println(file.getName());
        if (!file.exists()) {
            try {
                 Boolean a = file.createNewFile();
                 System.out.println(a);
                System.out.println("�����ɹ�");
            } catch (IOException ignored) {}
        }
    }
}
