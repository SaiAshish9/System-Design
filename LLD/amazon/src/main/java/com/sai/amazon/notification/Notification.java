package com.sai.amazon.notification;

import java.util.Date;

public class Notification {
    private Date created_on;
    private String notification_id;
    private String content;

    public Notification(String notification_id, String content) {
        this.created_on = new Date();
        this.notification_id = notification_id;
        this.content = content;
    }
}
