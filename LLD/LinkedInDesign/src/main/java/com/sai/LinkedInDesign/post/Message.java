package com.sai.LinkedInDesign.post;

public class Message {
    private String sentTo;
    private String messageBody;
    private String media;

    public Message(String sentTo, String messageBody, String media) {
        this.sentTo = sentTo;
        this.messageBody = messageBody;
        this.media = media;
    }
}