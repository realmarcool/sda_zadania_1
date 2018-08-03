package com.company;

//  Zadanie 1

public class Kot extends Zwierze {

//  Zadanie 2

    @Override
    public void wypiszJestemZwierzem() {
        System.out.println("Jestem koteł");
    }

    //  Zadanie 3
    private RasyKotow rasa;

    public Kot(String imie, int wiek, RasyKotow rasa){
        super(imie, wiek);
        this.rasa = rasa;
    }

}