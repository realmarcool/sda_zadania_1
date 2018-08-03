package com.company;

public class Czlowiek {

//  Zadanie 4

    private String imie;
    private String nazwisko;
    private Zwierze zwierze;
    private DaneAdresowe daneAdresowe;


    public Czlowiek(String imie, String nazwisko, Zwierze zwierze){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.zwierze = zwierze;
    }

//  Zadanie 5

    public void wypiszCos(){
        System.out.println("Cześć nazywam się " + imie + " " + nazwisko);
    }

    public void wypiszCoś(String komunikat){
        System.out.println("Cześć nazywam się " + imie + " " + nazwisko + ". " + komunikat + ".");
    }


}