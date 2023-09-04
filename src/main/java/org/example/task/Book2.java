package org.example.task;

import java.util.List;

public record Book2 (
        String title,
        String author,
        String isbn
) {

    public Book2(String title, String author) {
        this(title, author, null);
    }
}
