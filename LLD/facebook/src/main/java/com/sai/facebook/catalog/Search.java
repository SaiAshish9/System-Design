package com.sai.facebook.catalog;

import com.sai.facebook.feed.Group;
import com.sai.facebook.feed.Page;
import com.sai.facebook.feed.Post;
import com.sai.facebook.user.Member;

import java.util.List;

public interface Search {
    List<Member> searchMember(String name);
    Group searchGroup(String name);
    Page searchPage(String name);
    Post searchPost(String word);
}
