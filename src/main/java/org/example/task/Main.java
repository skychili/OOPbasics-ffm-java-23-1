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


        System.out.println("-----------");


        Book2 book2 = new Book2("book2", "me", "123");
        System.out.println(book2);

        System.out.println("Title: " + book2.title());
        System.out.println("Author: " + book2.author());


        Book2 book3 = new Book2("book2", "me");

        Book2 book3copy = new Book2(book3.title(), book3.author(), "678155");

        System.out.println(book3copy);

        System.out.println(book2.equals(book3));
    }
}
