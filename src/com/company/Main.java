package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
//      Rozbudowa zadań: 1, 2 i 3
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

//      Zadanie 5
//
//      Rozbudowa zadań: 1 , 2 ,3 i 4
//
//      Do klasy Człowiek dodać nową metodę która będzie wypisywać : “ Cześć nazywam się [tutaj powinniśmy wypisać imię i nazwisko ]”
//      Przeciążyć powyższą metodę, która będzie dodawała dodatkowy tekst, który będzie przyjmowany jako parametr metody.
//      Przykład w parametrze metody przeciążonej podamy “Kocham zwierzęta”. Tekst, który zostanie wyświetlony to : “ Cześć
//      nazywam się [tutaj powinniśmy wypisać imię i nazwisko ]. Kocham zwierzęta “
//      W metodzie main wywołać:
//      metodę w wersji “podstawowej” bez argumentów
//      metodę w wersji “rozszerzonej” z argumentem np. “Kocham zwierzęta”

        czlowiek1.wypiszCos();
        czlowiek2.wypiszCoś("Kocham zwierzęta");

//      Kategoria: Listy
//
//      Zadanie 6)
//
//      Wszystkie poniższe rzeczy wykonujemy w metodzie main
//
//      Stworzyć listę, która będzie zawierała elementy typu String
//      Do listy dodajmy 10 elementy wykorzystując metodę add()
//      Wyświetlamy listę za pomocą zwykłej pętli for
//      Wyświetlamy listę za pomocą pętli foreach

        List<String> lista1 = new ArrayList<>();
        lista1.add("element1");
        lista1.add("element2");
        lista1.add("element3");
        lista1.add("element4");
        lista1.add("element5");
        lista1.add("element6");
        lista1.add("element7");
        lista1.add("element8");
        lista1.add("element9");
        lista1.add("element10");

        for(int i = 0; i < lista1.size(); i++){
            System.out.println(lista1.get(i));
        }
        System.out.println("----------------------------------------");
        for (String text: lista1) {
            System.out.println(text);
        }


//      Zadanie 7
//
//      Stworzyć listę, która będzie zawierała elementy typu Integer
//      Do listy dodajemy 15 elementów poprzez wykorzystanie Arrays.asList ()
//      Wyświetlamy wszystkie elementy listy za pomocą foreach
//      Wyświetlamy wielkość listy
//      Usuwamy pierwszy i ostatni element listy
//      Wyświetlamy wielkość listy


        List<Integer> lista2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
        System.out.println("----------------------------------------");
        for (int i: lista2){
            System.out.println(i);
        }
        System.out.println("Wielkośc listy: " + lista2.size());
        lista2.remove(0);                       //TO NIE DZIAŁA!!
        lista2.remove(lista2.size()-1);         //I TO TEŻ!
        System.out.println("Wielkośc listy: " + lista2.size());






    }
}
