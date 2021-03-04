package com.company;

public class Main
{
    public static void main(String[] args)
    {
        BankA Bank1 = new BankA();
        Bank1.getBalance();
        Bank1.AccountState(1);

        BankB Bank2 = new BankB();
        Bank2.getBalance();
        Bank2.AccountState(2);

        BankC Bank3 = new BankC();
        Bank3.getBalance();
        Bank3.AccountState(3);
    }

}