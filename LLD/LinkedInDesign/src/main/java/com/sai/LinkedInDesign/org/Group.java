package com.sai.LinkedInDesign.org;

import com.sai.LinkedInDesign.user.Member;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Group {
    private String name;
    private String description;
    private int totalMembers;
    private List<Member> members;

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
        this.totalMembers = 0;
        this.members = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        this.members.add(member);
    }

    public void updateDescription(String description) {
        this.description = description;
    }

}