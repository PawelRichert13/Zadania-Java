package com.company;

public class Main {

    public static void main(String[] args)
    {

    }
    public void wyswietlanietablicy(int [][] tablica){
        for (int[] ints : tablica){
            for (int anint : ints){
                System.out.println(anint + "t");
            }
            System.out.println();
        }
    }
}