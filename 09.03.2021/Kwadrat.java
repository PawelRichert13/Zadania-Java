package com.company;

public abstract class Kwadrat implements Figura
{
    private int bok;
    private int pole;
    private int obwód;

    @Override
    public abstract void ObliczObwód();
    {
        int bok = 4;
        int obwód = (bok) * 4 ;
        System.out.println("Obwód = " +obwód);
    }

    @Override
    public abstract void ObliczPole();
    {
        int bok = 4;
        int pole = bok * bok;
        System.out.println("Pole = "+pole);
    }

}
