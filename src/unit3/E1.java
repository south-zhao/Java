package unit3;

public class E1 {
    public static void main(String[] args) {
//        char x = 'Äã';
//        char y = 'e';
//        char z = '³Ô';
//        if (x > 'A') {
//            y = 'Æ»';
//            z = '¹û';
//        }
//        else
//            y = 'Ëá';
//        z = 'Ìð';
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
