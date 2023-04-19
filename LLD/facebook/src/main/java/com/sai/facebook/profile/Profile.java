package com.sai.facebook.profile;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class Profile {
    private String profilePicture;
    private String coverPhoto;
    private String gender;
    private List<String> workExperiences;
    private List<String> educations;
    private List<String> places;
    private List<String> stats;

    public Profile(String profilePicture, String coverPhoto, String gender) {
        this.profilePicture = profilePicture;
        this.coverPhoto = coverPhoto;
        this.gender = gender;
        this.workExperiences = new ArrayList<>();
        this.educations = new ArrayList<>();
        this.places = new ArrayList<>();
        this.stats = new ArrayList<>();
    }

    public void addWorkExperience(String work) {
        // TODO
    }

    public void addEducation(String education) {
        // TODO
    }

    public void addPlace(String place) {
        // TODO
    }
}