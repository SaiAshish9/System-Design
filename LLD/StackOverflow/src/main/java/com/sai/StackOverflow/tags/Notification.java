package com.sai.StackOverflow.tags;

import java.util.Date;

public class Notification {
    private int notificationId;
    private Date createdOn;
    private String content;

    public Notification(int id, String content) {
        this.notificationId = id;
        this.createdOn = new Date();
        this.content = content;
    }

    public void sendNotification() {
    }
}