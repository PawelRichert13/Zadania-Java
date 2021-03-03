package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int liczba;
        for (liczba = -10; liczba <= 40; liczba++)
            if (Math.abs(liczba) %2 == 1)
                System.out.println(liczba);
    }
}