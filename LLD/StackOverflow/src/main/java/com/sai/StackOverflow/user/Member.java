package com.sai.StackOverflow.user;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private Account account;
    private List<String> badges;

    public Member(Account account) {
        this.account = account;
        this.badges = new ArrayList<>();
    }

    public int getReputation() {
        return account.getReputation();
    }

    public String getEmail() {
        return account.getEmail();
    }

    public void createQuestion(String question) {
    }

    public void createTag(String tag) {
    }
}
