package com.company;

/**
 * Created by RENT on 2017-04-26.
 */
public class Library {
    int iloscKsiazek;


    public int dodajemyKsiazke() {
        Book nowaKsiazka = new Book("Sienkiewicz", "Ogniem i Mieczem");
        iloscKsiazek = iloscKsiazek + 1;
        return iloscKsiazek;
    }

    public int wypozyczamyKsiazke() {
        iloscKsiazek = iloscKsiazek - 1;
        return iloscKsiazek;

    }

}
