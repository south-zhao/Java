package unit2;// 3.4

public class E3_4 {
    public static void main(String[] args) {
        long[] a = { 1, 2, 3, 4 };
        long[] b = { 100, 200, 300, 400, 500 };
        b = a;
        System.out.println("���� b �ĳ���:" + b.length); // ����1
        System.out.println("b[0]=" + b[0]); // ����2
    }
}
