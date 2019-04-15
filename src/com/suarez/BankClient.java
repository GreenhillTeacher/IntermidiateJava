package com.suarez;

public class BankClient {
    public static void main(String[] args)
    {
        BankAccount acct1 = new BankAccount();
        BankAccount acct2 = new BankAccount("Peter Smith","CDADC", 0);
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
        acct2.withdraw(34.0);
        System.out.println(acct2.toString());
        acct1.withdraw(450);
        System.out.println(acct1.toString());
    }
}
