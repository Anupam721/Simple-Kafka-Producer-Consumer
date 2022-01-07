package com.anupam.kafkaproducer;

public class Book {
    private String bookname;
    private String isbn;
    public Book() {
    }
    public Book(String bookname, String isbn) {
        this.bookname = bookname;
        this.isbn = isbn;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
}
