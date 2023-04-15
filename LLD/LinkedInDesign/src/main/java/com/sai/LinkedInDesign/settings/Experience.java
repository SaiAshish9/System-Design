package com.sai.LinkedInDesign.settings;

public class Experience {
    private String title;
    private String company;
    private String location;
    private String dateFrom;
    private String dateTo;
    private String description;

    public Experience(String title, String company, String location, String dateFrom, String dateTo, String description) {
        this.title = title;
        this.company = company;
        this.location = location;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.description = description;
    }
}