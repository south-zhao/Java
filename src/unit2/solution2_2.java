package unit2;// ���ȫ����ϣ����ĸ

public class solution2_2 {
    public static void main(String[] args) {
        char ch;
        char begin, end;
        begin = '\u0391'; // A
        end = '\u03D6'; // ϣ�� Pi ����
        for (ch = begin; ch <= end; ch++) {
            System.out.printf("%c ", ch);
        }
    }
}
