package unit2;// 3.1
import java.util.Scanner;
public class E {
    public static void main(String[] args) {
//        for (int i = 20302; i <= 20322; i++) {
////            System.out.println((char) i);
//            System.out.printf("%c ", (char) i);
//        }
        Scanner in = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while (in.hasNextDouble()) {
            double x = in.nextDouble();
            m = m + 1;
            sum = sum + x;
        }
        System.out.println(m);
        System.out.println(sum);
//        int x = 1;
//        short t = 12+'a';
//        char c ='a'+1;
////        char m ='a'+x;
//        byte n ='a'+1;
//        System.out.println(t);
//        System.out.println(c);
//        System.out.println(n);
    }
}
