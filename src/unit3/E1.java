package unit3;

public class E1 {
    public static void main(String[] args) {
//        char x = '��';
//        char y = 'e';
//        char z = '��';
//        if (x > 'A') {
//            y = 'ƻ';
//            z = '��';
//        }
//        else
//            y = '��';
//        z = '��';
//        System.out.println(x + "," + y + "," + z);
        int i = 1;
        double total = 0;
        do {
            double sum = 1;
            for (int j = 1; j <= i; j ++) {
                sum = sum * j;
            }
            total = total + 1 / sum;
            i ++;
        } while (i <= 20);
        System.out.println(total);
    }
}
