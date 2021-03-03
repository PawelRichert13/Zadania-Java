package com.company;

import java.util.Scanner;

public class Enemy
{
    public Enemy (int hp,int def)
    {
        Scanner scan = new Scanner(System.in);
        int enemyAtack;
        int EnemytotalHp;
        EnemytotalHp = hp + def;

        System.out.println("Wybierz broń: ");
        System.out.println("1.teleskop - 30 dmg");
        System.out.println("2.sztylet - 40 dmg");
        System.out.println("3.maczeta gniewu- 50dmg");
        System.out.println("4.klamka - 60");
        System.out.println("Wybierz broń przez wpisanie liczby i potwierdzenie");

        int wybor = scan.nextInt();
        switch (wybor)
        {
            case 1:
                enemyAtack = 30;
                break;
            case 2:
                enemyAtack = 40;
                break;
            case 3:
                enemyAtack = 50;
                break;
            case 4:
                enemyAtack = 60;
                break;
            default:
        }
    }
}