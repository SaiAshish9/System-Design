package com.sai.LinkedInDesign.org;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String description;
    private String type;
    private int companySize;
    private List<String> activeJobPostings;

    public Company(String name, String description, String type, int companySize) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.companySize = companySize;
        this.activeJobPostings = new ArrayList<>();
    }
}