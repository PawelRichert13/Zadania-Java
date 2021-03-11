package com.company;

public abstract class Trapez implements Figura
{
    private int bok_a; // górna podstawa
    private int bok_b; // dolna podstawa
    private int h; // wysokość
    private int ramie_1;
    private int ramie_2;
    private int pole;
    private int obwód;

    @Override
    public abstract void ObliczObwód();
    {
        int bok_a = 4;
        int bok_b = 7;
        int ramie_1 = 4;
        int ramie_2 = 4;
        int h = 5;
        int obwód = bok_a + bok_b + ramie_1 + ramie_2;
        System.out.println("Obwód = " +obwód);
    }

    @Override
    public abstract void ObliczPole();
    {
        int bok_a = 4;
        int bok_b = 7;
        int ramie_1 = 4;
        int ramie_2 = 4;
        int h = 5;
        int pole = ((bok_a + bok_b) * h ) /2;
        System.out.println("Pole = "+pole);
    }

}
