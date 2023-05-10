package unit10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г) {@code @Date:2022/12/12 15:16}
 * @File: Example10_4.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_4 {
    public static void main(String[] args) {
        int n = -1;
        byte[] a = new byte[200];
        try {
            File f = new File("S1.java");
            InputStream in = new FileInputStream(f);
            while ((n = in.read(a, 0, 200)) != -1) {
                String s = new String(a, 0, n);
                System.out.print(s);
            }
            in.close();
        }
        catch (IOException e) {
            System.out.println("File read Error" + e);
        }
    }
}
