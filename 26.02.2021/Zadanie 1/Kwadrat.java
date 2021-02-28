package com.company;

public class Kwadrat
{
    int bok;
    int obwod;
    int pole;

    public Kwadrat(int bok)
    {
     this.bok = bok;
     this.obwod = bok+bok+bok+bok;
     this.pole = bok * bok;
     System.out.println("obwod = " + this.obwod);
     System.out.println("pole = " + this.pole);

    }


}
