import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("��ӭ������Java����");
        System.out.println("Hello world!");
        Student stu = new Student();
        stu.setName();
        String name = stu.getName();
        System.out.printf("��Һã��ҽ�%s\n", name);
        int sums = add(10, 30);
        System.out.println(sums);
    }

    public static int add(int a,int b)//��ͺ��� �Ӻ���
    {
        int sum;
        sum=a+b;
        return sum;
    }
}

class Student{
    public String name;

    public void setName() {
        Scanner in = new Scanner(System.in);
        System.out.println("�������������:");
        name = in.nextLine();
    }

    public String getName() {
        return name;
    }
}