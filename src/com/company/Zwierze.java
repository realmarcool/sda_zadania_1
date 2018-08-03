package com.company;

//  Zadanie 1

public class Zwierze {

    private String imie;
    private int wiek;

    public Zwierze(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString(){
        return "Imię zwierzaczka: " + imie + ", wiek zwierzaczka: " + wiek;
    }

//  Zadanie 2

    public void wypiszJestemZwierzem(){
        System.out.println("Jestem zwierzę");
    }
}
