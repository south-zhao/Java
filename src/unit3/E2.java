package unit3;

public class E2 {
    public static void main(String[] args) {
        char c = '\0';
        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    c = 'J';
                    System.out.print(c);
                case 2:
                    c = 'e';
                    System.out.print(c);
                    break;
                case 3:
                    c = 'p';
                    System.out.print(c);
                default:
                    System.out.print("บร");
            }
        }
//        int i = 1;
//        int sum = 0;
//        do {
//            sum = sum + i;
//            i ++;
//        } while (sum < 8888);
//        System.out.println(i - 2);
    }
}