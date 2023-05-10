package unit9;

import javax.swing.*;
import java.awt.*;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/12/15 18:00}
 * @File: E9_1.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class E9_1 {
	public static void main(String[] args) {
		JFrame win1 = new JFrame("第一个");
		JFrame win2 = new JFrame("第二个");
		Container con1 = win1.getContentPane();
		Container con2 = win2.getContentPane();
		con1.setBackground(Color.BLUE);
		con2.setBackground(Color.yellow);
		win1.setBounds(60, 100, 188, 108);
		win2.setBounds(260, 100, 188, 108);
		win1.setVisible(true);
		win1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		win2.setVisible(true);
		win2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
