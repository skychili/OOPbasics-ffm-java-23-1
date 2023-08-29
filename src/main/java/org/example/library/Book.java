package org.example.library;

import java.util.Objects;

public class Book {
    private int pageCount;
    private String author;
    private String cover;
    private String title;
    private String genre;
    private String publisher;
    private int publishingYear;
    private String isbn;


    public Book() {

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

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        if (getPageCount() != book.getPageCount()) return false;
        if (publishingYear != book.publishingYear) return false;
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) return false;
        if (!Objects.equals(cover, book.cover)) return false;
        if (!Objects.equals(title, book.title)) return false;
        if (!Objects.equals(genre, book.genre)) return false;
        if (!Objects.equals(publisher, book.publisher)) return false;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        int result = getPageCount();
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (cover != null ? cover.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        result = 31 * result + publishingYear;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    public String toString() {
        return "Book{" +
                "pageCount=" + pageCount +
                ", author='" + author + '\'' +
                ", cover='" + cover + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishingYear=" + publishingYear +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
