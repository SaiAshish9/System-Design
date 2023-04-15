package com.sai.LinkedInDesign.enums;

public enum ConnectionInvitationStatus {
    PENDING(1),
    ACCEPTED(2),
    CONFIRMED(3),
    REJECTED(4),
    CANCELED(5);

    private int value;

    ConnectionInvitationStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}




















