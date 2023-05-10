package unit10;

import java.io.File;
import java.io.IOException;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г) {@code @Date:2022/12/12 15:11}
 * @File: Example10_3.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_3 {
    public static void main(String[] args) {
        File file = new File("1.txt");
        boolean a, b;
        try {
            a = file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);
        b = file.delete();
        System.out.println(b);
    }
}
