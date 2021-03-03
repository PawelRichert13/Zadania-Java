package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {


        double Fahr;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Podaj stopnie Celcjusza");
        double Celc = Scanner.nextDouble();
        Fahr = (1.8 * Celc) + 32; // jak damy 9/5 u Celc za nawiasem to nie styknie wynik
        System.out.println("To tyle Fahreheitów:" +Fahr);

    }
}