package com.sai.facebook.feed;

import java.math.BigInteger;

public class Comment {
    private BigInteger commentId;
    private String text;
    private BigInteger totalLikes;
    private String owner;

    public Comment(BigInteger id, String text, BigInteger total_likes, String owner) {
        this.commentId = id;
        this.text = text;
        this.totalLikes = total_likes;
        this.owner = owner;
    }
}