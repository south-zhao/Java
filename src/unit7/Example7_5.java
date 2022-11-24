package unit7;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(�Ϸ�) {@code @Date:2022/11/24 19:09}
 * @File: Example7_5.java
 * {@code @Describe: }
 * -*- coding: gbk -*-
 */
public class Example7_5 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        try {
            bank.income(200, -100);
            bank.income(300, -100);
            bank.income(400, -100);
            System.out.printf("Ŀǰ������%dԪ\n", bank.getMoney());
            bank.income(200, 100);
            bank.income(99999, -100);
        }
        catch (BankEx e) {
            System.out.println("������������е�����:");
            System.out.println(e.warn());
        }
        System.out.printf("Ŀǰ������%dԪ\n", bank.getMoney());
    }
}


class BankEx extends Exception {
    String message;
    public BankEx(int m, int n) {
        message = "�����ʽ�" + m + "�Ǹ�����֧��" + n + "������������������";
    }

    public String warn() {
        return message;
    }
}


class Bank {
    private int money;
    public void income (int in, int out) throws BankEx {
        if (in<=0 || out >=0 || in+out<=0) {
            throw new BankEx(in, out);
        }
        int netIncome = in + out;
        System.out.println("���εĴ�����Ϊ" + netIncome);
        money = money + netIncome;
    }
    public int getMoney() {
        return money;
    }
}



