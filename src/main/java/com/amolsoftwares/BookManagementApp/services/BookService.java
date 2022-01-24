package com.amolsoftwares.BookManagementApp.services;

import com.amolsoftwares.BookManagementApp.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private static List<Book> list = new ArrayList<>();

    static {
        list.add(new Book(01,"Book Name 01", "Book Author Name 01"));
        list.add(new Book(02,"Book Name 02", "Book Author Name 02"));
        list.add(new Book(03,"Book Name 03", "Book Author Name 03"));
        list.add(new Book(04,"Book Name 04", "Book Author Name 04"));
        list.add(new Book(05,"Book Name 05", "Book Author Name 05"));
    }

    //get all books
    public List<Book> getAllBooks(){
        return list;
    }

    //get single book by its it
    public Book getBookById(int id){
        Book book = null;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }
}
