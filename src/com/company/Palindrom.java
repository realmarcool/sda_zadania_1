package com.company;

public class Palindrom {

    public boolean porownaj1(String fraza) {
        String pomocnicza = "";
        char[] tablica = fraza.toCharArray();
        for (int i = fraza.length() - 1; i >= 0; i--) {
            pomocnicza += tablica[i];
        }
        return (fraza.equals(pomocnicza));
    }

    public boolean porownaj2(String fraza) {
        int j = 0;
        int z = 0;
        for (int i = fraza.length() - 1; i >= 0; i--) {
            if (fraza.charAt(j) == fraza.charAt(i)) {
                z++;
            }
            j++;
        }
        return (z == fraza.length());
    }
}
