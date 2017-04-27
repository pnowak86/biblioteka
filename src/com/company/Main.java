package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Pan Tadeusz");
        Book book2 = new Book("Matrix");
        Book book3 = new Book("Ogniem i mieczem");


        List<Book> booksForLibrary = new ArrayList<>();
        booksForLibrary.add(book1);
        booksForLibrary.add(book2);
        booksForLibrary.add(book3);



        Library library = new Library(booksForLibrary);


        // library.addBook(book1);
        // library.addBook(book1);
        //library.addBook(book1);
        //System.out.println(library.allBooks.size());
        library.deleteBook(book2);
        library.deleteBook("Pan Tadeusz");

        System.out.println(",,, " + library.allBooks.size());

        //System.out.println(book2.getTitle());


    }


}
