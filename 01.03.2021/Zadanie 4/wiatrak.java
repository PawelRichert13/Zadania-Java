package com.company;

public class wiatrak {
    public wiatrak(int a, boolean on, int radius,String color){
        final int slow = 1;
        final int medium = 2;
        final int fast = 3;
        int speed;
        String opis_wiatraka =" ma kolor " + color + " jego promień wynosi " + radius + " i kręci się z prędkością " + a;

        if (a == 1){
            speed = slow;
            System.out.println("predkosc wiatrak rowna: "+ speed);
        }
        if (a == 2){
            speed = medium;
            System.out.println("predkosc wiatrak rowna: "+ speed);
        }
        if (a == 3){
            speed = fast;
            System.out.println("predkosc wiatrak rowna: "+ speed);
        }
        if (on){
            System.out.println("wiatrak wlaczony" + opis_wiatraka);
        }else{
            System.out.println("wiatrak wylaczony" + opis_wiatraka);
        }
    }

    public wiatrak() {
        final int slow = 1;
        int speed = slow;
        String color = "blue";
        int radius = 6;
        boolean on = true;
        String opis_wiatraka =" ma kolor " + color + " jego promień wynosi " + radius + " i kręci się z prędkością " + speed;

        if (on){
            System.out.println("wiatrak wlaczony" + opis_wiatraka);
        }
    }
}