package com.samson.libraryms.service;

import com.samson.libraryms.model.Book;
import com.samson.libraryms.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> getAllBooks() {
        return (List<Book>)bookRepository.findAll();
    }

    @Override
    public List<Book> getBookByName(String name) {
        return bookRepository.findBookByName(name);
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book UpdateBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteBook(Book book) {
        bookRepository.delete(book);
    }
}
