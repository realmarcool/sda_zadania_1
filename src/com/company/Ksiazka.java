package com.company;

public class Ksiazka {
//    Tworzymy klasę Książka, która będzie zawierała pola tytuł, autor, liczba stron,
//    wydawnictwo.
//            Tworzymy 11 obiektów klasy Książka
//    Dodajemy je do listy, która będzie przechowywać książki(sposób dodania dowolny)
//    Wyświetlamy wszystkie elementy za pomocą System.out.println(...)
//    Usuwamy środkowy element listy
//    Wyświetlamy wszystkie elementy za pomocą System.out.println(...)
//    Wyświetlamy wielkość listy
//    Przechodzimy po liście(for, foreach) i wyświetlamy tylko książki, które mają powyżej
//200 stron

    private String tytul;
    private String autor;

    public int getLiczbaStron() {
        return liczbaStron;
    }

    private int liczbaStron;
    private String wydawnictwo;

    Ksiazka(String tytul, String autor, int liczbaStrons, String wydawnictwo){
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStrons;
        this.wydawnictwo = wydawnictwo;
    }
    @Override
    public String toString(){
        return "Tytuł książki: " + tytul + ", autor: " + autor + ", liczba stron: " + liczbaStron + ", wydawnictwo: " + wydawnictwo;
    }
}