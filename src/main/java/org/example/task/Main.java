package org.example.task;

public class Main {

    public static void main(String[] args) {
        Library l1 = new Library();

        Book bookA = new Book();
        bookA.setIsbn("A");
        bookA.setAuthor("A");
        bookA.setTitle("A");

        Book[] books = new Book[3];
        books[0] = bookA;
        books[1] = new Book("B", "B", "B");
        books[2] = new Book("C", "C", "C");

        l1.setBooks(books);


        System.out.println(l1);
    }
}
