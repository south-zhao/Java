package unit10;

import java.io.*;
import java.util.StringTokenizer;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/12/13 16:06}
 * @File: Example10_7.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example10_7 {
	public static void main(String[] args) {
		File fRead = new File("en.txt");
		File fWrite = new File("enc.txt");
		try {
			Writer out = new FileWriter(fWrite);
			BufferedWriter bufferedWriter = new BufferedWriter(out);
			Reader in = new FileReader(fRead);
			BufferedReader bufferedReader = new BufferedReader(in);
			String str = null;
			while ((str=bufferedReader.readLine())!=null) {
				StringTokenizer fenxi = new StringTokenizer(str);
				int count = fenxi.countTokens();
				str = str + "句子中的单词数:" + count;
				bufferedWriter.write(str);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			out.close();
			in = new FileReader(fWrite);
			bufferedReader = new BufferedReader(in);
			String s = null;
			System.out.println(fWrite.getName() + "内容:");
			while ((s = bufferedReader.readLine()) != null) {
				System.out.println(s);
			}
			bufferedReader.close();
			in.close();
		}catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
