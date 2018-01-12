package com.samson.libraryms.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Book implements Serializable{

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "book_code")
    private String bookCode;
    private String name;
    private String author;
    private String rackNo;
    private Double price;
    private String status;

    @Column(name = "number_of_books")
    private int numberOfBooks;

    public Book() {
    }

    public Book(String bookId, String name, String author, String rackNo, Double price, String status, int numberOfBooks) {
        this.bookCode = bookId;
        this.name = name;
        this.author = author;
        this.rackNo = rackNo;
        this.price = price;
        this.status = status;
        this.numberOfBooks = numberOfBooks;
    }
}
