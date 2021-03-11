package com.company;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Kwadrat L ");
        Kwadrat Kwadrat = new Kwadrat() {
            @Override
            public void ObliczObwód() {

            }

            @Override
            public void ObliczPole() {

            }
        };
        Kwadrat.ObliczPole();
        Kwadrat.ObliczObwód();

        System.out.println("Prostokat : ");
        Prostokąt Prostokąt = new Prostokąt() {
            @Override
            public void ObliczPole() {

            }

            @Override
            public void ObliczObwód() {

            }
        };
        Prostokąt.ObliczObwód();
        Prostokąt.ObliczPole();

        System.out.println("Trapez : ");
        Trapez Trapez = new Trapez() {
            @Override
            public void ObliczObwód() {

            }

            @Override
            public void ObliczPole() {

            }
        };
        Trapez.ObliczObwód();
        Trapez.ObliczPole();
        }
}