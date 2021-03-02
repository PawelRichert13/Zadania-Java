package com.company;

public class TV {
    int channel;
    int voliume;
    int on;

    public TV(int channel, int voliume, int on) {
        this.on = on;
        if (on > 5) {
            this.channel = channel;
            System.out.println("wyświetlam kanał: " + channel);

            this.voliume = voliume;
            System.out.println("Głośność ustawiona na: " + voliume);

            this.on = on;
            System.out.println("Telewizor włączony" + on);
        } else {
            System.out.println("Telewizor jest wyłączony");
        }
    }
}