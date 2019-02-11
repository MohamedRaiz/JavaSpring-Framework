package com.in28minutes.springboot.basics.springbootin10steps;

public class Book {
    long id;
    String name;
    String author;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Book(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Book [id=%s, name=%s, author=%s]", getId(), getName(),getAuthor());
    }
}
