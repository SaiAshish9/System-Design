package com.sai.StackOverflow.gallery;

import com.sai.StackOverflow.user.Member;

import java.util.Date;

public class Photo {
    private int photoId;
    private String photoPath;
    private Date creationDate;
    private Member creatingMember;

    public Photo(int id, String path, Member member) {
        this.photoId = id;
        this.photoPath = path;
        this.creationDate = new Date();
        this.creatingMember = member;
    }

    public void delete() {
    }
}