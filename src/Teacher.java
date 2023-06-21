/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风)
 * @date:2023/6/21 10:17
 * @File: Teacher.java
 * @Describe: -*- coding: gbk -*-
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Teacher {
    public static void main(String[] args) {
        Computer computer = new Computer("算法测试");
        computer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        computer.setSize(600, 120);
        computer.setLocation(500, 200);
        computer.setVisible(true);
    }
}

class Teach{
    private final float num1;
    private final float num2;
    private final float num3;
    private final String operator;
    private final String operator1;
    private final float res2;

    public Teach(){
        Random random = new Random();
        num1 = Float.parseFloat(String.format("%.2f", random.nextFloat(100)));
        num2 = Float.parseFloat(String.format("%.2f", random.nextFloat(100)));
        num3 = Float.parseFloat(String.format("%.2f", random.nextFloat(100)));
        int op = random.nextInt(4);
        int op1 = random.nextInt(4);
        operator = oper(op);
        operator1 = oper(op1);
        float res1 = res(num1, num2, operator);
        res2 = res(res1, num3, operator1);
    }
    public float res(float num1, float num2, String op1){
        float a = 0;
        if (op1.equals("+"))
		{
            a = num1+num2;
		}

		else if(op1.equals("-"))
		{
			a = num1-num2;
		}

		else if(op1.equals("*"))
		{
			a = num1*num2;
		}

		else if(op1.equals("/"))
		{
			a = num1/num2;
		}
        return Float.parseFloat(String.format("%.2f", a));
    }

    public String oper(int op) {
        String operator = "";
        if (op == 0)
            operator = "+";
        if (op == 1)
            operator = "-";
        if (op == 2)
            operator = "*";
        if (op == 3)
            operator = "/";
        return operator;
    }

    public float getSum2() {
        return res2;
    }
    public float getNum1() {
        return num1;
    }
    public float getNum2() {
        return num2;
    }
    public float getNum3() {
        return num3;
    }
    public String getOperator() {
        return operator;
    }
    public String getOperator1() {
        return operator1;
    }

    public boolean re(float result) {
        float res = getSum2();
        return result == res;
    }
}



class Computer extends JFrame{
    Teach teach1;
    JButton getQuestion, confirmAnswer;
    JTextField text1, text2, text3, text4;
    JLabel label1, label2, label3, checkLabel;

    public Computer(String s){
        super(s);
        teach1 = new Teach();
        setLayout(new FlowLayout());
        text1 = new JTextField(6);
        text1.setEditable(false);
        text2 = new JTextField(6);
        text2.setEditable(false);
        text3 = new JTextField(6);
        text3.setEditable(false);
        text4 = new JTextField(15);
        label1 = new JLabel(" ");
        label2 = new JLabel(" ");
        label3 = new JLabel("=");
        checkLabel = new JLabel();
        getQuestion = new JButton("获取题目");
        getQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teach1 = new Teach();
                label1.setText(teach1.getOperator());
                label2.setText(teach1.getOperator1());
                text1.setText(String.valueOf(teach1.getNum1()));
                text2.setText(String.valueOf(teach1.getNum2()));
                text3.setText(String.valueOf(teach1.getNum3()));
            }
        });
        confirmAnswer = new JButton("确认答案");
        confirmAnswer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (text4.getText().length()==0)
                    checkLabel.setText("请输入答案！");
                else {
                    float result = Float.parseFloat(text4.getText());
                    if (teach1.re(result))
                        checkLabel.setText("回答正确");
                    else
                        checkLabel.setText("回答错误, 正确答案为" + teach1.getSum2());
                }
            }
        });

        add(getQuestion);
        add(text1);
        add(label1);
        add(text2);
        add(label2);
        add(text3);
        add(label3);
        add(text4);
        add(confirmAnswer);
        add(checkLabel);
        setVisible(true);
        validate();
    }

}

