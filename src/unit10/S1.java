package unit10;

/*
  -*- coding: gbk -*-

  @author:south(до╥Г) {@code @Date:2022/12/10 9:24}
 * @File: S1.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */

import java.io.*;

public class S1 {

    public static void main(String[] args) {

        File f = new File("src\\unit10\\S1.java");

        try {
            RandomAccessFile random = new RandomAccessFile(f, "rw");

            random.seek(0);

            long m = random.length();

            while (m >= 0) {

                m = m - 1;

                random.seek(m);

                int c = random.readByte();

                if (c >= 0)

                    System.out.print((char) c);
            }

        }
        catch (Exception ignored) {}
    }
}