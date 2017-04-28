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

    public Book borrow(String title) {
        return searchBook(title);
    }


    //public boolean isBookBorrowed()

    public boolean returnBook(Book bookToReturn) {
        //searchBook(bookToReturn.getTitle());
        boolean result = false;
        Book bookFound = searchBook(bookToReturn);
        if (bookFound != null) {
            //boolean result = bookToReturn.getTitle().equals(bookFound.getTitle());
            //result = bookToReturn == bookFound;
            result = bookFound.equals(bookToReturn);
        }

        return result;
    }


    public void addBook(Book book) {
        allBooks.add(book);
    }

    public void deleteBook(Book book) {
        allBooks.remove(book);
    }

    public void deleteBook(String bookTitle) {

        Book bookFound = searchBook(bookTitle);
        if (bookFound != null)
            allBooks.remove(bookFound);
    }

    public Book searchBook(Book book) {
        System.out.println("dasds");
        return searchBook(book.getTitle());
    }


    public Book searchBook(String title) {


        boolean isBookFound = false;
        int idx = 0;
        Book book = null;

        while (isBookFound == false) {
            book = allBooks.get(idx);
            isBookFound = book.getTitle().equals(title);
            idx++;

        }

        return book;
    }
}


