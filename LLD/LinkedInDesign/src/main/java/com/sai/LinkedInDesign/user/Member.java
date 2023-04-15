package com.sai.LinkedInDesign.user;


import com.sai.LinkedInDesign.settings.Profile;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends Person {
    private Date dateOfMembership;
    private String headline;
    private List<String> photo;
    private List<String> memberSuggestions;
    private List<String> memberFollows;
    private List<String> memberConnections;
    private List<String> companyFollows;
    private List<String> groupFollows;
    private Profile profile;

    Member(String name, String address, String email, String phone, String account) {
        super(name, address, email, phone, account);
        this.dateOfMembership = new Date();
        this.headline = "";
        this.photo = new ArrayList<>();
        this.memberSuggestions = new ArrayList<>();
        this.memberFollows = new ArrayList<>();
        this.memberConnections = new ArrayList<>();
        this.companyFollows = new ArrayList<>();
        this.groupFollows = new ArrayList<>();
        this.profile = new Profile();
    }

    public void sendMessage(String message) {
    }

    public void createPost(String post) {
    }

    public void sendConnectionInvitation(String connectionInvitation) {
    }
}