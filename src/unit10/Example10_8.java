package unit10;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г) {@code @Date:2022/12/15 15:38}
 * @File: Example10_8.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_8 {
	public static void main(String[] args) {
		RandomAccessFile randomAccessFile = null;
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		try {
			randomAccessFile = new RandomAccessFile("tom.dat", "rw");
			for (int i = 0; i < data.length; i++) {
				randomAccessFile.writeInt(data[i]);
			}
			for (long i = data.length-1; i >= 0; i--) {
				randomAccessFile.seek(i * 4);
				System.out.printf("\t%d", randomAccessFile.readInt());
			}
			randomAccessFile.close();
		}catch (IOException ignored) {
		}
	}
}
