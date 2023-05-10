package unit10;

import java.io.*;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(до╥Г) {@code @Date:2022/12/13 15:30}
 * @File: Example10_6.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_6 {
	public static void main(String[] args) {
		File sourceFile = new File("a.txt");
		File targetFile = new File("b.txt");
		char[] c = new char[19];
		try {
			Writer writer = new FileWriter(targetFile, true);
			Reader reader = new FileReader(sourceFile);
			int n = -1;
			while ((n=reader.read(c)) != -1) {
				writer.write(c, 0, n);
			}
			writer.flush();
			writer.close();
		}
		catch (IOException e) {
			System.out.println("Error " + e);
		}
	}
}
