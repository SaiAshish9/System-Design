package com.sai.LibraryManagementSystem.catalog;

import java.util.Date;
import java.util.Map;

public class Catalog implements Search {
    private Map<String, String> book_titles;
    private Map<String, String> book_authors;
    private Map<String, String> book_subjects;
    private Map<String, String> book_publication_dates;

    public String search_by_title(String title) {
        return book_titles.get(title);
    }

    public String search_by_author(String author){
        return book_authors.get(author);
    }

    public String search_by_subject(String subject) {
        return book_subjects.get(subject);
    }

    public String search_by_pub_date(Date publish_date) {
        return book_publication_dates.get(publish_date);
    }

}
