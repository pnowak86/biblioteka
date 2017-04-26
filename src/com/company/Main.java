package com.company;

public class Main {

    public static void main(String[] args) {
        Library biblioteka = new Library();

        biblioteka.dodajemyKsiazke();
        biblioteka.dodajemyKsiazke();
        biblioteka.dodajemyKsiazke();


        biblioteka.wypozyczamyKsiazke();

        System.out.println("Ilosc ksiazek w bibliotece: " + biblioteka.iloscKsiazek);


    }


}
