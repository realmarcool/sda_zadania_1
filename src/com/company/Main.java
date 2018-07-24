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

//      Zadanie 4
//
//      Rozbudowa zadań: 1 , 2 i 3
//
//      Stworzyć klasę Człowiek, która będzie zawierała pola, imię, nazwisko
//      Klasa człowiek powinna zawierać konstruktor publiczny, który będzie przyjmował wszystkie pola jako argumenty
//      Stworzyć klasę Dane Adresowe, która będzie zawierała pola dotyczące adresu, numeru telefonu, maila itp.
//      Do klasy Człowiek dodać dwa kolejne pola:
//      Pole zwierzę, które będzie typu Zwierzę, Pole dane adresowe, które będzie typu Dane Adresowe
//      W metodzie main, stworzyć dwa obiekty klasy Człowiek:
//      Dla jednego obiektu w polu zwierzę przypisać obiekt klasy Pies(który został stworzony we wcześniejszych zadaniach)
//      Dla drugiego obiektu w polu zwierzę przypisać obiekt klasy Kot(który został stworzony we wcześniejszych zadaniach)

        Czlowiek czlowiek1 = new Czlowiek("Jan", "Kowalski");
        Czlowiek czlowiek2 = new Czlowiek("Adam", "Nowak");
        czlowiek1.zwierze = pies;
        czlowiek2.zwierze = kot;


    }
}
