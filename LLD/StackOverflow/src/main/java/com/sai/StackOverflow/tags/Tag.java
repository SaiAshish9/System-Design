package com.sai.StackOverflow.tags;

public class Tag {
    private String name;
    private String description;
    private int dailyAskedFrequency;
    private int weeklyAskedFrequency;

    public Tag(String name, String description) {
        this.name = name;
        this.description = description;
        this.dailyAskedFrequency = 0;
        this.weeklyAskedFrequency = 0;
    }
}





