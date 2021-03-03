package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj wielkosc tablicy");
        int j = scan.nextInt();
        String[] tab = new String[j];

        Scanner odczyt = new Scanner(System.in);

        //pobranie danych
        for(int i=0; i<j; i++)
            tab[i] = odczyt.nextLine();

        //wyświetlenie
        for(int i=0; i<j; i++)
            System.out.println(tab[i]);
    }
}