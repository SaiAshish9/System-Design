package com.sai.LinkedInDesign.org;

import java.util.Date;

public class JobPosting {
    private Date dateOfPosting;
    private String description;
    private String employmentType;
    private String location;
    private boolean isFulfilled;

    public JobPosting(String description, String employmentType, String location, boolean isFulfilled) {
        this.dateOfPosting = new Date();
        this.description = description;
        this.employmentType = employmentType;
        this.location = location;
        this.isFulfilled = isFulfilled;
    }
}