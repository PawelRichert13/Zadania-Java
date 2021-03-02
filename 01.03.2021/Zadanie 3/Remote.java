
package com.company;

import java.util.Scanner;

public class Remote {
    int channel;
    int volume;
    int on;
    public Remote(int channel, int volume, int on) {
        Scanner scan = new Scanner(System.in);
        this.on = on;
        System.out.println("włączyć telewizor ?");
        System.out.println("0 - nie");
        System.out.println("1 - tak");

        // ---- kanały ----
        int wybor1 = scan.nextInt();
        if (wybor1 == 1) {
            int nowy = on + 5;
            System.out.println("Włączony");

            this.channel = channel;
            System.out.println("aktualny kanał = " + this.channel);
            System.out.println("Program niżej - 1");
            System.out.println("Program wyżej + 1");

            int wybor2 = scan.nextInt();
            if (wybor2 == 1)
            {
                System.out.println("Ile kanałów w góre?");
                int ilosc = scan.nextInt();
                int nowy1 = channel + ilosc;

                System.out.println("OBecny kanał = " + nowy1);
            }

            if (wybor2 == 2) {
                System.out.println("Ile kanałów w dół?");
                int ilosc = scan.nextInt();
                int nowy1 = channel - ilosc;
                System.out.println("Obecny kanał: " + nowy1);
            }
            // ---- Głośność ----

            this.volume = volume;
            System.out.println("Aktualny volume = " + this.volume);
            System.out.println("Volume w dół - 2");
            System.out.println("Volume w góre - 1");

            int wybor3 = scan.nextInt();
            if (wybor3 == 1) {
                System.out.println("Aktualny volume = " + this.volume);
                System.out.println("O ile volume w dół?");
                int ilosc = scan.nextInt();
                int nowy2 = volume - ilosc;
                System.out.println("Obecny volume =" + nowy2);
            }
        } else {
            System.out.println("Do widzenia");
        }
    }
}

