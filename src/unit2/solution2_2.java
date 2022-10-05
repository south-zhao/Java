package unit2;// Êä³öÈ«²¿µÄÏ£À°×ÖÄ¸

public class solution2_2 {
    public static void main(String[] args) {
        char ch;
        char begin, end;
        begin = '\u0391'; // A
        end = '\u03D6'; // Ï£À° Pi ·ûºÅ
        for (ch = begin; ch <= end; ch++) {
            System.out.printf("%c ", ch);
        }
    }
}
