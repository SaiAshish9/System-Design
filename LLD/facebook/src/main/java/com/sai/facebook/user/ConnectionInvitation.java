package com.sai.facebook.user;

import com.sai.facebook.enums.ConnectionInvitationStatus;
import lombok.Data;

import java.util.Date;

@Data
public class ConnectionInvitation {

    private Member memberInvited;
    private String name;
    private ConnectionInvitationStatus status;
    private Date dateCreated;
    private Date dateUpdated;


    public ConnectionInvitation(Member memberInvited, String name, ConnectionInvitationStatus status) {
        this.memberInvited = memberInvited;
        this.name = name;
        this.status = status;
        this.dateCreated = new Date();
        this.dateUpdated = new Date();
    }

    public void acceptConnection() {
    }
    public void rejectConnection() {
    }
}