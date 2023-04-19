package com.sai.facebook.user;

import com.sai.facebook.feed.Group;
import com.sai.facebook.feed.Message;
import com.sai.facebook.feed.Page;
import com.sai.facebook.feed.Post;
import com.sai.facebook.profile.Profile;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member extends Person {
    private BigInteger memberId;
    private Date dateOfMembership;
    private String name;
    private Profile profile;
    private List<Member> memberFollows;
    private List<Member> memberConnections;
    private List<Page> pageFollows;
    private List<Member> memberSuggestions;
    private List<ConnectionInvitation> connectionInvitations;
    private List<Group> groupFollows;

    public Member(BigInteger id, Date dateOfMembership, String name) {
        this.memberId = id;
        this.dateOfMembership = dateOfMembership;
        this.name = name;
        this.profile = new Profile();
        this.memberFollows = new ArrayList<>();
        this.memberConnections = new ArrayList<>();
        this.pageFollows = new ArrayList<>();
        this.memberSuggestions = new ArrayList<>();
        this.connectionInvitations = new ArrayList<>();
        this.groupFollows = new ArrayList<>();
    }

    public void sendMessage(Message message) {
        // implementation
    }

    public void createPost(Post post) {
        // implementation
    }

    public void sendConnectionInvitation(ConnectionInvitation invitation) {
        // implementation
    }

    public void searchMemberSuggestions() {
        // implementation
    }
}