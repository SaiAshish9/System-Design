package com.sai.LibraryManagementSystem.utils.book;

import com.sai.LibraryManagementSystem.enums.ReservationStatus;

import java.util.Date;

public class BookReservation {
    private Date creation_date;
    private ReservationStatus status;
    private String book_item_barcode;
    private int member_id;

    public BookReservation(Date creation_date, ReservationStatus status, String book_item_barcode, int member_id) {
        this.creation_date = creation_date;
        this.status = status;
        this.book_item_barcode = book_item_barcode;
        this.member_id = member_id;
    }

    public static void sendBookAvailableNotification(){

    }

    public static BookReservation fetchReservationDetails(String barcode) {
        return null;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public String getBook_item_barcode() {
        return book_item_barcode;
    }

    public void setBook_item_barcode(String book_item_barcode) {
        this.book_item_barcode = book_item_barcode;
    }

    public int getMemberId() {
        return member_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }
}