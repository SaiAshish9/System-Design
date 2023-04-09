package com.sai.LibraryManagementSystem.book;

import java.util.List;

public interface IBookBuilder {
    void setISBN(String ISBN);
    void setTitle(String title);
    void setSubject(String subject);
    void setPublisher(String publisher);
    void setLanguage(String language);
    void setNumber_of_pages(int number_of_pages);
    void setAuthors(List<String> authors);
}
