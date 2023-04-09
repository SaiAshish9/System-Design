package com.sai.LibraryManagementSystem.utils.book;

import java.time.LocalDateTime;
import java.util.Date;

public class BookLending {
    private Date creationDate;
    private LocalDateTime dueDate;
    private String bookItemBarcode;
    private Long memberId;

    public BookLending(Date creationDate, LocalDateTime dueDate, String bookItemBarcode, Long memberId) {
        this.creationDate = creationDate;
        this.dueDate = dueDate;
        this.bookItemBarcode = bookItemBarcode;
        this.memberId = memberId;
    }

    public static boolean lendBook(String barcode, Long memberId) {
        return false;
    }

    public static BookLending fetchLendingDetails(String barcode) {
        return null;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public String getBookItemBarcode() {
        return bookItemBarcode;
    }

    public void setBookItemBarcode(String bookItemBarcode) {
        this.bookItemBarcode = bookItemBarcode;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}