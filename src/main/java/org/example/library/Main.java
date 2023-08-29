package org.example.library;

import org.example.library.Book;

public class Main {
    public static void main(String[] args) {
        Book floriansBook = new Book("Witze", 114, "Otto");
        Book florians2ndBook = new Book();

        /*floriansBook.title = "Unnützes Wissen";
        floriansBook.pageCount = 315;

        florians2ndBook.title = "1000 Irrtümer der allgmeinen Bildung";
        florians2ndBook.pageCount = 320;

        System.out.println(floriansBook.title);
        System.out.println(florians2ndBook.title);

        floriansBook.canGrowl();
        floriansBook.isSoldOut();*/

        Book joshuasBuch = new Book("Witze", 114, "Otto");


        System.out.println(joshuasBuch.getPageCount());
        System.out.println(joshuasBuch.getAuthor());
        joshuasBuch.setPageCount(485);
        System.out.println(joshuasBuch.getPageCount());

        System.out.println(joshuasBuch);
        System.out.println(joshuasBuch.toString());


        floriansBook.setPageCount(485);
        if (joshuasBuch.equals(floriansBook)) {
            System.out.println("ja sind gleich");
        }
        else {
            System.out.println("nein sind nicht gleich");
        }
    }
}
