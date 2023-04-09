package com.sai.LibraryManagementSystem.book;

public class Rack {

    private Long number;
    private String location_identifier;

    Rack(Long number, String location_identifier){
        this.number = number;
        this.location_identifier = location_identifier;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
