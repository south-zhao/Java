package unit7;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�)
 * {@code @date:2022/11/16} 10:08
 * @File: Example7_1.java
 * {@code @Describe:}
 * -*- coding: gbk -*-
 */
public class Example7_1 {
    public static void main(String[] args) {
        RedCowForm form = new RedCowForm("��ţũ��");
        form.showCowMess();;
        form.cow.speak();
    }
}


class RedCowForm {
    static String formName;
    RedCow cow;
    RedCowForm() {

    }

    RedCowForm(String a) {
        cow = new RedCow(150, 112, 5000);
        formName = a;
    }
    public void showCowMess() {
        cow.speak();
    }
    class RedCow { // �ڲ��������
        String cowName = "��ţ";
        int height, weight, price;
        RedCow(int h, int w, int p) {
            height = h;
            weight = w;
            price = p;
        }

        void speak() {
            System.out.println(height + "," + weight + "," + price);
        }
    }
}






