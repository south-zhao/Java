package unit10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/12/12 15:28}
 * @File: Example10_5.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_5 {
    public static void main(String[] args) {
        byte[] a = "新年快乐".getBytes();
        byte[] b = "Happy New Year".getBytes();
        File file = new File("b.txt");
        try {
            OutputStream outputStream = new FileOutputStream(file);
            System.out.println(file.getName() + "的大小" + file.length());
            outputStream.write(a);
            outputStream.close();
            outputStream = new FileOutputStream(file, true);
            System.out.println(file.getName() + "的大小" + file.length());
            outputStream.write(b, 0, b.length);
            System.out.println(file.getName() + "的大小" + file.length());
            outputStream.close();
        }catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}
