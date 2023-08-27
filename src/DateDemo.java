import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.*;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(???)
 * @date:2022/9/21 11:20
 * @File: DateDemo.java
 * @Describe: ???Date??
 * -*- coding: gbk -*-
 */
public class DateDemo {
	public static void main(String[] args) {
//		String s = new Date().toString();
//		System.out.println(new Date());
//		System.out.println(s);
		Date deadline = new Date(2022, Calendar.NOVEMBER, 20, 13, 20, 30);
		System.out.println(deadline);
		GregorianCalendar calendar = new GregorianCalendar();
		Date time = calendar.getTime();
		GregorianCalendar clac = new GregorianCalendar(2022, Calendar.NOVEMBER, 20, 13, 40, 30);
		clac.add(Calendar.YEAR, -time.getYear()-1900);
//		System.out.println(time.getYear());
		System.out.println(clac.getTime());
		System.out.println(calendar.getTime());
		System.out.println(time);
	}
}
