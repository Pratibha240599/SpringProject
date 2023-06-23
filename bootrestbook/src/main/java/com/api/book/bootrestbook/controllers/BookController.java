package com.api.book.bootrestbook.controllers;

import com.api.book.bootrestbook.entities.Book;
import com.api.book.bootrestbook.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public List<Book> getBooks()
    {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") int id)
    {
        return bookService.getBookById(id);
    }
}
