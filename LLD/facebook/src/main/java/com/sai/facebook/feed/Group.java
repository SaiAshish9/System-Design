package com.sai.facebook.feed;

import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Data
public class Group {
    private BigInteger groupId;
    private String name;
    private String description;
    private int totalMembers;
    private List<String> members;

    public Group(BigInteger id, String name, String description, int total_members) {
        this.groupId = id;
        this.name = name;
        this.description = description;
        this.totalMembers = total_members;
        this.members = new ArrayList<>();
    }

    public void addMember(String member) {
    }

    public void updateDescription(String description) {
    }
}