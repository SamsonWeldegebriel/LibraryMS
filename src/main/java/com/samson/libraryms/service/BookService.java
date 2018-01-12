package com.samson.libraryms.service;

import com.samson.libraryms.model.Book;

import java.util.List;

public interface  BookService {
    List<Book> getAllBooks();
    List<Book> getBookByName(String name);
    void saveBook(Book book);
    Book UpdateBook(Book book);
    void deleteBook(Book book);
}
