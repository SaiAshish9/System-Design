package com.sai.amazon.dto;

public class Address {
    private String street_adress;
    private String city;
    private String state;
    private String zip_code;
    private String country;

    Address(String street, String city, String state, String zip_code, String country) {
        this.street_adress = street;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        this.country = country;
    }

}
