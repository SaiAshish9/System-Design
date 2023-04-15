package com.sai.LinkedInDesign.post;

import java.math.BigInteger;

public class Post {
    private String text;
    private String owner;
    private BigInteger total_shares;
    private BigInteger total_likes;

    public Post(String text, String owner) {
        this.text = text;
        this.owner = owner;
        this.total_shares = BigInteger.valueOf(0);
        this.total_likes = BigInteger.valueOf(0);
    }

}