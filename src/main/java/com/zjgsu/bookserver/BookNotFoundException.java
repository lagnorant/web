package com.zjgsu.bookserver;

public class BookNotFoundException extends RuntimeException{
    BookNotFoundException(int id) {
        super("Could not find book " + id);
    }
}
