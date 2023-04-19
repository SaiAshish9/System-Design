package com.sai.facebook.feed;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recommendation {
    private int id;
    private String rating;
    private String description;
    private Date createdAt;
}



