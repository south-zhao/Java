package unit10;
import java.io.*;
/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/11/30 11:03}
 * @File: Example10_1.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_1 {
    public static void main(String[] args) {
        File f = new File("src\\sql.java");
//        File f = new File("src\\sql.java");
        System.out.println(f.getName() + "是可读的吗:" + f.canRead());
        System.out.println(f.getName() + "长度的:" + f.length());
        System.out.println(f.getName() + "绝对路径:" + f.getAbsolutePath());
        File file = new File("1.txt");
        System.out.println(file.getName());
        if (!file.exists()) {
            try {
                 Boolean a = file.createNewFile();
                 System.out.println(a);
                System.out.println("创建成功");
            } catch (IOException ignored) {}
        }
    }
}
