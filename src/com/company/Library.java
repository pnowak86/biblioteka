package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-26.
 */
public class Library {

    //private Book book;
    //private Integer[] myInts = new Integer[10];


    List<Book> allBooks = new ArrayList<>();


    Library(List<Book> acquiredBooks) {
        allBooks.addAll(acquiredBooks);
    }


    public void addBook(Book book) {
        allBooks.add(book);
    }

    public void deleteBook(Book book) {
        allBooks.remove(book);
    }

    public void deleteBook(String bookTitle){

    boolean isBookToDelete = false;
    int idx = 0;
    Book book = null;

            while(isBookToDelete == false)
    {
        book = allBooks.get(idx);
        isBookToDelete = book.getTitle().equals(bookTitle);
        idx++;
    }



   if (isBookToDelete == true)
       allBooks.remove(book);
        System.out.println("removed book: " + book.getTitle());
        //for (int i = 0; i < allBooks.size(); i++) {
        //Book book =  allBooks.get(i);
        // boolean isBookToDelete = book.getTitle().equals(bookTitle)

}
    }


