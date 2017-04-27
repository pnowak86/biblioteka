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

        Book borrowedBook = library.borrow("Ogniem i mieczem");

        System.out.println("Books in library: " + library.allBooks.size());
        System.out.println("Borrowed book is: " + borrowedBook.getTitle());
        Book bookToReturn = borrowedBook;
        boolean returnSuccess = library.returnBook(bookToReturn);
        System.out.println(returnSuccess);

        //System.out.println(book2.getTitle());
        //dodac 2 razy ta sama ksiazke, dzialac na duplikatach, sprawdzic czy usuwamy tylko duplikaty
        //usuwanie ksiazki w przypadku duplikatow
    }
}
