package com.sai.facebook.feed;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Page {
    private BigInteger pageId;
    private String name;
    private String description;
    private String type;
    private int totalMembers;
    private List<String> recommendation;

    public Page(BigInteger id, String name, String description, String type, int total_members) {
        this.pageId = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.totalMembers = total_members;
        this.recommendation = new ArrayList<>();
    }
}