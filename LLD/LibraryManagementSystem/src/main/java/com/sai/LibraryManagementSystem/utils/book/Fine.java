package com.sai.LibraryManagementSystem.utils.book;

import java.util.Date;
import java.util.List;

public class Fine {
    private Date creation_date;
    private String book_item_barcode;
    private Long member_id;

    public static void collectFine(Long member_id, int days){

    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getBook_item_barcode() {
        return book_item_barcode;
    }

    public void setBook_item_barcode(String book_item_barcode) {
        this.book_item_barcode = book_item_barcode;
    }

    public Long getMember_id() {
        return member_id;
    }

    public void setMemberId(Long member_id) {
        this.member_id = member_id;
    }
}
