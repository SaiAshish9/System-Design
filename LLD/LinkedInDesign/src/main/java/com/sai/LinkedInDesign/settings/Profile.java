package com.sai.LinkedInDesign.settings;

import java.util.ArrayList;
import java.util.List;

public class Profile {
    private String summary;
    private List<String> experiences;
    private List<String> educations;
    private List<String> skills;
    private List<String> accomplishments;
    private List<String> recommendations;
    private List<String> stats;

    public Profile(){}

    public Profile(String summary, List<String> experiences,
                   List<String> educations, List<String> skills,
                   List<String> accomplishments, List<String> recommendations) {
        this.summary = summary;
        this.experiences = experiences;
        this.educations = educations;
        this.skills = skills;
        this.accomplishments = accomplishments;
        this.recommendations = recommendations;
        this.stats = new ArrayList<>();
    }

    public void addExperience(String experience) {
        // TODO
    }

    public void addEducation(String education) {
        // TODO
    }

    public void addSkill(String skill) {
        // TODO
    }

    public void addAccomplishment(String accomplishment) {
        // TODO
    }

    public void addRecommendation(String recommendation) {
        // TODO
    }
}
