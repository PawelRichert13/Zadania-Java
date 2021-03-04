package com.company;

abstract class Bank
{
    abstract String getBalance();
    public  void AccountState(int Bankr)
    {
        System.out.println(Bankr + "Bank new balance: " + getBalance());

    }
}