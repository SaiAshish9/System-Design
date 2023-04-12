package com.sai.StackOverflow.QnA;

import com.sai.StackOverflow.gallery.Photo;
import com.sai.StackOverflow.user.Member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Answer {
    private String answer_text;
    private boolean accepted;
    private int vote_count;
    private int flag_count;
    private Date creation_time;
    private Member creating_member;
    private List<Photo> photos;

    public Answer(String text, Member member) {
        this.answer_text = text;
        this.accepted = false;
        this.vote_count = 0;
        this.flag_count = 0;
        this.creation_time = new Date();
        this.creating_member = member;
        this.photos = new ArrayList<>();
    }

    public void incrementVoteCount() {
        this.vote_count++;
    }
}