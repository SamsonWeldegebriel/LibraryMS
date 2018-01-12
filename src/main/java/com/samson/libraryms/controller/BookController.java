package com.samson.libraryms.controller;

import com.samson.libraryms.model.Book;
import com.samson.libraryms.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;


    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getBooksList(Model model){
        model.addAttribute("books", bookService.getAllBooks());
        return "listbook";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addBook(){
        Book book1 = new Book("1","Ded", "Sira", "tyu", 20.0, "new", 100);
        bookService.saveBook(book1);
        return "addbook";
    }

}
