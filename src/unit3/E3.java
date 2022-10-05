package unit3;

public class E3 {
    public static void main(String[] args) {
//        int x = 1, y = 6;
//        while (y-- > 0) {
//            x--;
//        }
//        System.out.print("x=" + x + ",y=" + y);
        int n = 0;
        for (int i = 2; i <= 100;i ++) {
            int num = 0;
            for (int j = 2; j <= i / 2; j ++) {
                if (i % j == 0)
                    num ++;
            }
            if (num == 0) {
                System.out.printf("%dÊÇËØÊý    ", i);
                n ++;
                if (n % 5 == 0)
                    System.out.println();
            }
        }
    }
}