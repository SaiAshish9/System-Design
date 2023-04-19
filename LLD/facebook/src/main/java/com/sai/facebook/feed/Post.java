package com.sai.facebook.feed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private BigInteger id;
    private String text;
    private int total_likes;
    private int total_shares;
    private String owner;
}