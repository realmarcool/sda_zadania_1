package com.company;

public class Main {

    public static void main(String[] args) {

//      Klasy i dziedziczenie
//
//      Zadanie 1
//
//      Stworzyć klasę Zwierzę, która będzie zawierała pola: (String)imię, (Integer)wiek.
//      Stworzyć klasę Pies i Kot, które będą dziedziczyły po klasie Zwierze.
//      Klasy Pies i Kot nie posiadają swoich własnych pól.
//      Klasa Zwierzę powinna posiadać konstruktor publiczny, który przyjmie wszystkie pola opisane powyżej.
//      W klasie Zwierze dodać metodę toString()
//      W metodzie main stworzyć jeden obiekt klasy Pies i jeden obiekt klasy Kot i wypisać je na ekran.

        Pies pies = new Pies();
        Kot kot = new Kot();
        kot.imie = "kicia";
        kot.wiek = 10;
        pies.imie = "burek";
        pies.wiek = 15;
        System.out.println(kot);
        System.out.println(pies);

//      Zadanie2

//      Rozbudowa Zadania 1.
//      Dodać do klasy Zwierzę metodę, która będzie wypisywać na ekran “Jestem Zwierzę”.
//      Dodać w klasach Pies i Kot nadpisywanie metody(@Override), która została stworzona w klasie Zwierzę.
//      Metoda dla Psa powinna wypisać na ekran “Jestem Pies” a dla Kota “Jestem Kot”
//      W metodzie main wywołać dla Psa i Kota tą metodę, którą stworzyliśmy.

        pies.wypiszJestemZwierzem();
        kot.wypiszJestemZwierzem();





    }
}
