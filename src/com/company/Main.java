package com.company;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.*;

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

        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(lista1.get(i));
        }
        System.out.println("----------------------------------------");
        for (String text : lista1) {
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


        List<Integer> lista2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        System.out.println("----------------------------------------");
        for (int i : lista2) {
            System.out.println(i);
        }
        System.out.println("Wielkośc listy: " + lista2.size());
        lista2.remove(0);
        lista2.remove(lista2.size() - 1);
        System.out.println("Wielkośc listy: " + lista2.size());


//      Zadanie 8
//
//      Tworzymy klasę Książka, która będzie zawierała pola tytuł, autor, liczba stron, wydawnictwo.
//      Tworzymy 11 obiektów klasy Książka
//      Dodajemy je do listy, która będzie przechowywać książki(sposób dodania dowolny)
//      Wyświetlamy wszystkie elementy za pomocą System.out.println(...)
//      Usuwamy środkowy element listy
//      Wyświetlamy wszystkie elementy za pomocą System.out.println(...)
//      Wyświetlamy wielkość listy
//      Przechodzimy po liście(for, foreach) i wyświetlamy tylko książki, które mają powyżej 200 stron

        Ksiazka ksiazka1 = new Ksiazka("tytul 1", "autor 1", 100, "wydawnictwo 1");
        Ksiazka ksiazka2 = new Ksiazka("tytul 2", "autor 2", 120, "wydawnictwo 2");
        Ksiazka ksiazka3 = new Ksiazka("tytul 3", "autor 3", 140, "wydawnictwo 3");
        Ksiazka ksiazka4 = new Ksiazka("tytul 4", "autor 4", 160, "wydawnictwo 4");
        Ksiazka ksiazka5 = new Ksiazka("tytul 5", "autor 5", 180, "wydawnictwo 5");
        Ksiazka ksiazka6 = new Ksiazka("tytul 6", "autor 6", 200, "wydawnictwo 6");
        Ksiazka ksiazka7 = new Ksiazka("tytul 7", "autor 7", 220, "wydawnictwo 7");
        Ksiazka ksiazka8 = new Ksiazka("tytul 8", "autor 8", 240, "wydawnictwo 8");
        Ksiazka ksiazka9 = new Ksiazka("tytul 9", "autor 9", 260, "wydawnictwo 9");
        Ksiazka ksiazka10 = new Ksiazka("tytul 10", "autor 10", 280, "wydawnictwo 10");
        Ksiazka ksiazka11 = new Ksiazka("tytul 11", "autor 11", 300, "wydawnictwo 11");
        List<Ksiazka> listaKsiazek1 = new ArrayList<>(Arrays.asList(ksiazka1, ksiazka2, ksiazka3, ksiazka4, ksiazka5,
                ksiazka6, ksiazka7, ksiazka8, ksiazka9, ksiazka10, ksiazka11));
        System.out.println("-------------------------------------------");
        System.out.println("Lista książek:");
        for (Ksiazka wyswietl : listaKsiazek1) {
            System.out.println(wyswietl);
        }
        System.out.println("-------------------------------------------");
        System.out.println("Lista książek po usunięciu środkowej pozycji:");
        listaKsiazek1.remove(5);
        for (Ksiazka wyswietl : listaKsiazek1) {
            System.out.println(wyswietl);
        }
        System.out.println("Wielkość listy książek: " + listaKsiazek1.size());
        System.out.println("-------------------------------------------");
        System.out.println("Lista książek mających powyżej 200 stron:");
        for (Ksiazka wyswietl : listaKsiazek1) {
            if (wyswietl.liczbaStron > 200) {
                System.out.println(wyswietl);
            }
        }

//      Zadanie 9
//
//      Rozbudowa zadania : 8
//
//      Tworzymy drugą listę która będzie również zawierać książki
//      Dodajemy do tej listy 4 obiekty klasy Książka
//      Powinniśmy mieć 2 listy jedna z zadania 8, która posiada 10 obiektów i drugą która posiada 4 elementy
//      Do listy, która posiada 10 elementów dodajemy naszą drugą listę(która ma 4 elementy). Wykorzystujemy do tego metodę addAll(...)
//      Wyświetlamy wielkość listy
//      Wyświetlamy wszystkie elementy listy.

        Ksiazka ksiazka12 = new Ksiazka("tytul 12", "autor 12", 300, "wydawnictwo 12");
        Ksiazka ksiazka13 = new Ksiazka("tytul 13", "autor 13", 320, "wydawnictwo 13");
        Ksiazka ksiazka14 = new Ksiazka("tytul 14", "autor 14", 340, "wydawnictwo 14");
        Ksiazka ksiazka15 = new Ksiazka("tytul 15", "autor 15", 360, "wydawnictwo 15");
        List<Ksiazka> listaKsiazek2 = new ArrayList<>(Arrays.asList(ksiazka12, ksiazka13, ksiazka14, ksiazka15));
        listaKsiazek1.addAll(listaKsiazek2);
        System.out.println("-------------------------------------------");
        System.out.println("Lista książek po dodaniu czterech książek ma wielkość: " + listaKsiazek1.size());
        for (Ksiazka wyswietl : listaKsiazek1) {
            System.out.println(wyswietl);
        }

//      Zadanie 10
//      Zadanie nieobowiązkowe - zakres tego programu będzie omawiany dopiero na kolejnych zajęciach.(Wskazówka wykorzystać zbiory)
//
//      Należy napisać program, który będzie pobierał Imiona od użytkownika dopóki użytkownik nie wpisze słowa “END”.
//      Program w czasie rzeczywistym powinien weryfikować czy dane Imię już nie zostało niewpisane.
//      Po wpisaniu słowa “END”:
//      ● Wyświetl ilość wpisanych imion
//      ● Wyświetl wszystkie elementy.

        Set<String> imiona = new HashSet<>();
        Scanner pobierz = new Scanner(System.in);
        String imie;
        System.out.println("--------------------------------------------");
        System.out.println("Podaj imię lub napisz END aby zakończyć");
        do {
            imie = pobierz.nextLine();
            if (!imie.equals("END")) {
                imiona.add(imie);
            }
        }
        while (!imie.equals("END"));
        System.out.println("Liczba imion: " + imiona.size());
        System.out.println("Lista imion:");
        for (String wyswietl : imiona) {
            System.out.print(wyswietl + ", ");
        }

//      Zadanie 11) -​ Zadanie nieobowiązkowe - zakres tego programu będzie omawiany dopiero na kolejnych zajęciach . ​

//      Napisać program, który będzie przyjmował słowa, które są ​ palindromem(wyszukać w internecie co to jest).
//      Jeżeli wpisane słowo nie jest palindromem, wyświetlić odpowiedni  komunikat na ekranie. Słowa w kontenerze nie mogą się powtarzać.
//      Zależy mi w tym zadaniu abyście znaleźli różne metody, które pozwolą sprawdzić czy dane słowo jest palindromem(im więcej tym lepiej).
//      Wpisywanie słów ma się zakończyć jeżeli wpiszemy słowo “END”.
//      Po zakończeniu wpisywania wyświetlamy na ekranie wszystkie palindromy, które użytkownik wprowadził.

        Set<String> slowa = new HashSet<>();
        String slowo;
        Palindrom palindrom = new Palindrom();
        System.out.println("--------------------------------------------");
        System.out.println("Podaj frazę lub napisz END aby zakończyć");
        do {
            slowo = pobierz.nextLine();
            if (!slowo.equals("END")) {
                if (palindrom.porownaj1(slowo)) {
                    System.out.println("Fraza " + slowo + " jest palindromem");
                    slowa.add(slowo);
                } else {
                    System.out.println("Fraza " + slowo + " nie jest palindromem");
                }
            }
        }
        while (!slowo.equals("END"));
        System.out.println("Lista wszystkich wprowadzonych palindromów:");
        for (String wyswietl : slowa) {
            System.out.print(wyswietl + ", ");
        }
    }
}