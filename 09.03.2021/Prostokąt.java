package com.company;

public abstract class Prostokąt implements Figura
{
    private int bok1;
    private int bok2;
    private int pole;
    private int obwód;

    @Override
    public abstract void ObliczPole();
    {
        int bok1 = 4;
        int bok2 = 6;
        int pole = (bok1) * (bok2);
        System.out.println("Pole= " +pole);
    }

    @Override
    public abstract void ObliczObwód();
    {
        int bok1 = 4;
        int bok2 = 6;
        int obwód = bok1 + bok1 + bok2 + bok2;
        System.out.println("Obwód = " +obwód);
    }
}
