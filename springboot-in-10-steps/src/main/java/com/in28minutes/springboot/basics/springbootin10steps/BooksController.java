package com.in28minutes.springboot.basics.springbootin10steps;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    //whenever someone executes a GET request on /books, want it to return a  set of hardcoded books. This is done via using @Getmapping. This is basically mapping a get URL
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1l, "Mastering Spring 5.1322", "Raiz"));
        //Here we are actually returning a book.

    }
}
