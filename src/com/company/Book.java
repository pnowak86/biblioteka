package com.company;

/**
 * Created by RENT on 2017-04-26.
 */
public class Book {
    String author;
    String title;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

}

