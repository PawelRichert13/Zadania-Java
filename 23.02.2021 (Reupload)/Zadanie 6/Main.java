package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("podaj trzy liczby");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ((a > b) && (a > c) && (b > c)) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
        else if ((b > a) && (b > c) && (a > c)) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        }
        else if ((c > b) && (c > a) && (b > a)) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
        else if ((c > b) && (c > a) && (a > b)) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);

        }
    }
}

