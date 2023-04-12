package com.sai.StackOverflow.QnA;

import com.sai.StackOverflow.user.Member;

import java.util.Date;

public class Comment {
    private String text;
    private Date creationTime;
    private int flagCount;
    private int voteCount;
    private Member askingMember;

    public Comment(String text, Member member) {
        this.text = text;
        this.creationTime = new Date();
        this.flagCount = 0;
        this.voteCount = 0;
        this.askingMember = member;
    }

    public void incrementVoteCount() {
        voteCount++;
    }
}