package com.company;

//  Zadanie 1

public class Zwierze {

    //TODO pola powinny być prywatne
    String imie;
    int wiek;

    //TODO po co pusty konstruktor ?
    public Zwierze(){
        imie = "";
        wiek = 0;
    }

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
