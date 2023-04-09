package com.sai.amazon.product;

import com.sai.amazon.user.Member;

public class ProductReview {
    private float rating;
    private String review;
    private Member reviewer;

    ProductReview(float rating, String review, Member reviewer){
        this.rating = rating;
        this.review = review;
        this.reviewer = reviewer;
    }

}
