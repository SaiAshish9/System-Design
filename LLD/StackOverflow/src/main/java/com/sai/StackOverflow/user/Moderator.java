package com.sai.StackOverflow.user;

import com.sai.StackOverflow.search.Question;

public class Moderator extends Member {
    public Moderator(Account account) {
        super(account);
    }

    public void closeQuestion(Question question) {
        // do nothing
    }

    public void undeleteQuestion(Question question) {
        // do nothing
    }
}


