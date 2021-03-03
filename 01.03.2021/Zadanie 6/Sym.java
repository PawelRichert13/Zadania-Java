package com.company;
import java.util.Scanner;
public class Sym {

    public Sym(int Playerhp,int Playerdef, int Enemyhp, int Enemydef)
    {

        Scanner scan = new Scanner(System.in);
        int playerAtack = 0;
        int PlayertotalHp;
        PlayertotalHp = Playerhp + Playerdef;

        System.out.println("Wybierz broń: ");
        System.out.println("1.teleskop - 30 dmg");
        System.out.println("2.sztylet - 40 dmg");
        System.out.println("3.maczeta gniewu- 50dmg");
        System.out.println("4.klamka - 60");
        System.out.println("Wybierz broń przez wpisanie liczby i potwierdzenie");

        int wybor = scan.nextInt();
        switch (wybor) {
            case 1:
                playerAtack = 30;
                break;
            case 2:
                playerAtack = 40;
                break;
            case 3:
                playerAtack = 50;
                break;
            case 4:
                playerAtack = 60;
                break;
            default:
        }
        int enemyAtack = 0;
        int EnemytotalHp;
        EnemytotalHp = Enemyhp + Enemydef;

        System.out.println("Wybierz broń: ");
        System.out.println("1.teleskop - 30 dmg");
        System.out.println("2.sztylet - 40 dmg");
        System.out.println("3.maczeta gniewu- 50dmg");
        System.out.println("4.klamka - 60");
        System.out.println("Wybierz broń przez wpisanie liczby i potwierdzenie");

        int wybor1 = scan.nextInt();
        switch (wybor1)
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

        do {
            EnemytotalHp = EnemytotalHp - playerAtack;
            PlayertotalHp = PlayertotalHp - enemyAtack;

        }while(EnemytotalHp == 0 || PlayertotalHp == 0);
        if (EnemytotalHp<PlayertotalHp){
            System.out.println("wygrywa gracz");
        }else{
            System.out.println("wygrywa przeciwnik");
        }
    }
}