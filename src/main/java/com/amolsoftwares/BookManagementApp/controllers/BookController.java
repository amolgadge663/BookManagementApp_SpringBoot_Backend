package com.amolsoftwares.BookManagementApp.controllers;

import com.amolsoftwares.BookManagementApp.entities.Book;
import com.amolsoftwares.BookManagementApp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    public BookService bookService;

    @GetMapping("/books")
    private List<Book> getBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    private Book getBookById(@PathVariable("id") int id){
        return bookService.getBookById(id);
    }

}
