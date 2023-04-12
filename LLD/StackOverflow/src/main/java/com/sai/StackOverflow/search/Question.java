package com.sai.StackOverflow.search;

import com.sai.StackOverflow.QnA.Answer;
import com.sai.StackOverflow.QnA.Comment;
import com.sai.StackOverflow.enums.QuestionClosingRemark;
import com.sai.StackOverflow.enums.QuestionStatus;
import com.sai.StackOverflow.gallery.Photo;
import com.sai.StackOverflow.user.Member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question implements Search {
    private String title;
    private String description;
    private int viewCount;
    private int voteCount;
    private Date creationTime;
    private Date updateTime;
    private QuestionStatus status;
    private QuestionClosingRemark closingRemark;
    private int bounty;
    private Member askingMember;
    private List<Photo> photos;
    private List<Comment> comments;
    private List<Answer> answers;

    public Question(String title, String description, int bounty, Member askingMember) {
        this.title = title;
        this.description = description;
        this.viewCount = 0;
        this.voteCount = 0;
        this.creationTime = new Date();
        this.updateTime = new Date();
        this.status = QuestionStatus.OPEN;
        this.closingRemark = QuestionClosingRemark.DUPLICATE;
        this.bounty = bounty;
        this.askingMember = askingMember;
        this.photos = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public void close() {
    }

    public void undelete() {
    }

    public void addComment(Comment comment) {
    }

    public void addBounty(int bounty) {
    }

    public void search(String query) {
    }
}