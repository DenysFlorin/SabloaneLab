package com.example.start1.controllers;

import com.example.start1.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    private List<Book> books = new ArrayList<>();

    @GetMapping()
    public List<Book> getBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable int id) {
        if (id >= 0 && id < books.size()) {
            return books.get(id);
        }
        return null;
    }

    @PostMapping()
    public String addBook(@RequestBody Book book) {
        books.add(book);
        return "Added book: " + book.toString();
    }

    @PutMapping("/{id}")
    public String updateBook(@PathVariable int id, @RequestBody Book book) {
        if (id >= 0 && id < books.size()) {
            books.set(id, book);
        }
        return "Updated book: " + book.toString();
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        if (id >= 0 && id < books.size()) {
            books.remove(id);
        }
        return "Deleted book: " + books.toString();
    }
}
