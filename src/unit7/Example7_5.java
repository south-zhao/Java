package unit7;

/**
 * -*- coding: gbk -*-
 *
 * @author:south(南风) {@code @Date:2022/11/24 19:09}
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
            System.out.printf("目前银行有%d元\n", bank.getMoney());
            bank.income(200, 100);
            bank.income(99999, -100);
        }
        catch (BankEx e) {
            System.out.println("计算收益过程中的问题:");
            System.out.println(e.warn());
        }
        System.out.printf("目前银行有%d元\n", bank.getMoney());
    }
}


class BankEx extends Exception {
    String message;
    public BankEx(int m, int n) {
        message = "入账资金" + m + "是负数或支出" + n + "是正数，不符合条件";
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
        System.out.println("本次的纯收入为" + netIncome);
        money = money + netIncome;
    }
    public int getMoney() {
        return money;
    }
}



