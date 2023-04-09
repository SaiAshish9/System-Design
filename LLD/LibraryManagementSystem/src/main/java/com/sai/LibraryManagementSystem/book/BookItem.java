package com.sai.LibraryManagementSystem.book;

import com.sai.LibraryManagementSystem.enums.BookStatus;
import com.sai.LibraryManagementSystem.utils.book.BookLending;

import java.time.LocalDateTime;
import java.util.Date;

public class BookItem extends Book {
    private String barcode;
    private boolean isReferenceOnly;
    private boolean borrowed;
    private LocalDateTime dueDate;
    private double price;
    private String bookFormat;
    private BookStatus status;
    private Date dateOfPurchase;
    private Date publicationDate;
    private String placedAt;

    BookItem(String ISBN, String title, String subject, String publisher, String language, int number_of_pages,
             String barcode, boolean isReferenceOnly, boolean borrowed, LocalDateTime dueDate, double price,
             String bookFormat, BookStatus status, Date dateOfPurchase, Date publicationDate, String placedAt) {
        super(ISBN, title, subject, publisher, language, number_of_pages);
        this.barcode = barcode;
        this.isReferenceOnly = isReferenceOnly;
        this.borrowed = borrowed;
        this.dueDate = dueDate;
        this.price = price;
        this.bookFormat = bookFormat;
        this.status = status;
        this.dateOfPurchase = dateOfPurchase;
        this.publicationDate = publicationDate;
        this.placedAt = placedAt;
    }

    public boolean checkout(Long memberId) {
        if (isReferenceOnly) {
            System.out.println("This book is Reference only and can't be issued");
            return false;
        }
        if (!BookLending.lendBook(barcode, memberId)) {
            return false;
        }
        status = BookStatus.LOANED;
        return true;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isReferenceOnly() {
        return isReferenceOnly;
    }

    public void setReferenceOnly(boolean referenceOnly) {
        isReferenceOnly = referenceOnly;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBookFormat() {
        return bookFormat;
    }

    public void setBookFormat(String bookFormat) {
        this.bookFormat = bookFormat;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPlacedAt() {
        return placedAt;
    }

    public void setPlacedAt(String placedAt) {
        this.placedAt = placedAt;
    }
}
