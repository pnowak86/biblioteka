package com.company;

/**
 * Created by RENT on 2017-04-26.
 */
public class Library {
    int iloscKsiazek;
    String[] polki = new String;


    public int dodajemyKsiazke() {
        Book nowaKsiazka = new Book("Sienkiewicz", "Ogniem i Mieczem");
        iloscKsiazek = iloscKsiazek + 1;

        String[] polki = new String;
        if (iloscKsiazek>1)
        {
         while()
        }

        return iloscKsiazek;

        // public static void wyswietlKsiazki()
        // {
        //    System.out.println(nowaKsiazka);
        //  }

        //if(iloscKsiazek>0)
        //System.out.println(nowaKsiazka);
    }

    public int wypozyczamyKsiazke() {
        iloscKsiazek = iloscKsiazek - 1;
        return iloscKsiazek;

    }

}
