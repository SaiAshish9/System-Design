package com.sai.facebook.catalog;

import com.sai.facebook.feed.Group;
import com.sai.facebook.feed.Page;
import com.sai.facebook.feed.Post;
import com.sai.facebook.user.Member;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SearchIndex implements Search {

    private Map<String, List<Member>> member_names;
    private Map<String, Group> group_names;
    private Map<String, Page> page_titles;
    private Map<String, Post> posts;

    public void addMember(Member member) {
        if (member_names.containsKey(member.getName())) {
            member_names.get(member.getName()).add(member);
        } else {
            member_names.put(member.getName(), Arrays.asList(member));
        }
    }

    public void add_group(Group group) {

    }

    public void add_page(Page page) {

    }

    public void add_post(Post post) {

    }

    @Override
    public List<Member> searchMember(String name) {
        return member_names.get(name);
    }

    @Override
    public Group searchGroup(String name) {
        return group_names.get(name);
    }

    @Override
    public Page searchPage(String name) {
        return page_titles.get(name);
    }

    @Override
    public Post searchPost(String word) {
        return posts.get(word);
    }
}
