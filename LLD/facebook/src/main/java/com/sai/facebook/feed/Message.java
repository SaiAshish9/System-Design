package com.sai.facebook.feed;

import java.math.BigInteger;

public class Message {
    private BigInteger messageId;
    private String sentTo;
    private String messageBody;
    private String media;

    public Message(BigInteger id, String sent_to, String body, String media) {
        this.messageId = id;
        this.sentTo = sent_to;
        this.messageBody = body;
        this.media = media;
    }

    public void addMember(String member) {
    }
}