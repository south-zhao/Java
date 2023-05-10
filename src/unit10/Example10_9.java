package unit10;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г) {@code @Date:2022/12/15 16:00}
 * @File: Example10_9.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_9 {
	public static void main(String[] args) {
		RandomAccessFile in = null;
		try {
			in = new RandomAccessFile("Example10_9.java", "rw");
			long length = in.length();
			long p = 0;
			in.seek(p);
			while (p<length) {
				String str = in.readLine();
				byte[] b = str.getBytes("iso-8859-1");
				str = new String(b);
				p = in.getFilePointer();
				System.out.println(str);
			}
		}catch (IOException ignored) {}
	}
}
