package com.company;

//  Zadanie 1

public class Pies extends Zwierze {

//  Zadanie 2

    @Override
    public void wypiszJestemZwierzem() {
        System.out.println("Jestem pieseł");
    }

    //  Zadanie 3
    private RasyPsow rasa;

    public Pies(String imie, int wiek, RasyPsow rasa){
        super(imie, wiek);
        this.rasa = rasa;
    }

}
