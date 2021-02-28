package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Punkt point1 = new Punkt(7, 9);
        Punkt point2 = new Punkt();

        System.out.println("Odległość: " + point1.calculateDistance(point2));

    }



}