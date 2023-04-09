package com.sai.LibraryManagementSystem.catalog;

import java.util.Date;

public interface Search {
    String search_by_title(String title);
    String search_by_author(String author);
    String search_by_subject(String subject);
    String search_by_pub_date(Date publish_date);
}
