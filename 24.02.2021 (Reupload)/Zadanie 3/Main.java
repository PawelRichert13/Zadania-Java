
package com.company;

public class Main {

    public static void main(String[] args) {

        int i = -10;
        int a = 40;
        while ((i++) < a) {
            if (Math.abs(i) % 2 == 1){

                System.out.println(i);
            }
        }
    }
}
