package objectorientedprogramming.encapsulation;

import java.util.*;

interface loanable {
    void applyLoan();
    double calcLoanElig();
}

abstract class bankacct {
    private String accNo;
    private String holder;
    private double bal;

    bankacct(String accNo, String holder, double bal) {
        this.accNo = accNo;
        this.holder = holder;
        this.bal = bal;
    }

    String getAccNo() { return accNo; }
    void setAccNo(String accNo) { this.accNo = accNo; }

    String getHolder() { return holder; }
    void setHolder(String holder) { this.holder = holder; }

    double getBal() { return bal; }

    void deposit(double amt) {
        if (amt > 0)
            bal += amt;
    }

    void withdraw(double amt) {
        if (amt > 0 && amt <= bal)
            bal -= amt;
    }

    abstract double calcInt();
}

class savacct extends bankacct implements loanable {
    savacct(String no, String h, double b) {
        super(no, h, b);
    }

    double calcInt() {
        return getBal() * 0.04;
    }

    public void applyLoan() {
        System.out.println("loan applied savings");
    }

    public double calcLoanElig() {
        return getBal() * 5;
    }
}

class curacct extends bankacct implements loanable {
    curacct(String no, String h, double b) {
        super(no, h, b);
    }

    double calcInt() {
        return getBal() * 0.02;
    }

    public void applyLoan() {
        System.out.println("loan applied current");
    }

    public double calcLoanElig() {
        return getBal() * 3;
    }
}

public class banksystem {
    public static void main(String[] args) {
        List<bankacct> list = new ArrayList<>();

        bankacct a1 = new savacct("SB01", "Asha", 50000);
        bankacct a2 = new curacct("CA01", "Ravi", 80000);

        list.add(a1);
        list.add(a2);

        for (bankacct a : list)
            System.out.println(a.getAccNo() + " " + a.calcInt());
    }
}
