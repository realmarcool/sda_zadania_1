package com.company;

public class Czlowiek {

//  Zadanie 4

    //TODO pola powinny być prywatne
    String imie;
    String nazwisko;
    Zwierze zwierze;
    DaneAdresowe daneAdresowe;

    public Czlowiek(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

//  Zadanie 5

    public void wypiszCos(){
        System.out.println("Cześć nazywam się " + imie + " " + nazwisko);
    }

    public void wypiszCoś(String komunikat){
        System.out.println("Cześć nazywam się " + imie + " " + nazwisko + ". " + komunikat + ".");
    }


}
