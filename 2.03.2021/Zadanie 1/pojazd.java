package com.company;
public class pojazd {
    private String silnik;
    private String kolor;
    private double rozmiar;
    public String model;

    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public pojazd(String silnik, String kolor, double rozmiar)
    {
        this.silnik = silnik;
        this.kolor = kolor;
        this.rozmiar = rozmiar;
        String model = "Stan pojazdu : silnik "+ silnik +" kolor " + kolor + " rozmiar " + rozmiar;
        System.out.println(model);
    }

}