package com.company;

import static java.lang.Math.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj x i y pierwszej współżednej");
        double x1 = scan.nextInt();
        double y1 = scan.nextInt();

        System.out.println("podaj x i y drugiej współżednej");
        double x2 = scan.nextInt();
        double y2 = scan.nextInt();

        double wynik;

        wynik = sqrt((x2-x1)*(x2-x1) + (y2-y1) * (y2-y1));
        System.out.println("odległość między punktami wynosi " + wynik);
    }
}
