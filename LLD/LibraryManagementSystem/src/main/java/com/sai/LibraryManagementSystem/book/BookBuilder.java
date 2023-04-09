package com.sai.LibraryManagementSystem.book;

import java.util.List;

public class BookBuilder implements IBookBuilder {
    private Book book;

    public BookBuilder(){
        this.book = new Book();
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

}
