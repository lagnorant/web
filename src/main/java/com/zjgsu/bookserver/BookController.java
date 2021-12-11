package com.zjgsu.bookserver;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    private final BookRepository repo = new BookRepository();

    public BookController() {
    }

    @GetMapping("/books")
    List<Book> all() {
        return repo.findAll();
    }

    @GetMapping("/books/{id}")
    Book one(@PathVariable int id) {
        Book book = repo.findById(id);

        if (book != null) {
            return book;
        } else {
            throw new BookNotFoundException(id);
        }
    }

    @PutMapping("/books/{id}")
    Book replaceBook(@RequestBody Book newBook, @PathVariable int id) {
        Book book = repo.findById(id);
        if (book != null) {
            if (newBook.getTitle() != null) {
                book.setTitle(newBook.getTitle());
            }
            if (newBook.getAuthor() != null) {
                book.setAuthor(newBook.getAuthor());
            }
            if (newBook.getPages() > 0) {
                book.setPages(newBook.getPages());
            }
            if (newBook.getPrice() > 0) {
                book.setPrice(newBook.getPrice());
            }
            return repo.save(book);
        } else {
            newBook.setId(id);
            return repo.save(newBook);
        }
    }

    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable int id) {
        repo.deleteById(id);
    }
}
