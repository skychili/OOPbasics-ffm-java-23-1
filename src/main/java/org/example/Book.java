package org.example;

public class Book {
    int pageCount;
    String author;
    String cover;
    String title;
    String genre;
    String publisher;
    int publishingYear;
    String isbn;


    public void canGrowl(){
        System.out.println("Grrrrrrrr");
    }

    public void isSoldOut(){
        System.out.println("Buch ist ausverkauft!");
    }

    public Book(){

    }

    public Book(String bookTitle, int pageCount) {
        this.title = bookTitle;
        this.pageCount = pageCount;
    }

    public Book(String bookTitle, int publishingYear, String publisher) {
        this.title = bookTitle;
        this.publishingYear = publishingYear;
        this.publisher = publisher;
    }


}
