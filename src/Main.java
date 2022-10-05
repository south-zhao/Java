import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	System.out.println("欢迎你来到Java世界");
        System.out.println("Hello world!");
        Student stu = new Student();
        stu.setName();
        String name = stu.getName();
        System.out.printf("大家好，我叫%s\n", name);
        int sums = add(10, 30);
        System.out.println(sums);
    }

    public static int add(int a,int b)//求和函数 子函数
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
        System.out.println("请输入你的姓名:");
        name = in.nextLine();
    }

    public String getName() {
        return name;
    }
}