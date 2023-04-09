package com.sai.LibraryManagementSystem.user;

import com.sai.LibraryManagementSystem.enums.AccountStatus;

public class Librarian extends Account {
    Librarian(Long id, String password, String person) {
        super(id, password, person);
    }

    Librarian(Long id, String password, String person, AccountStatus status) {
        super(id, password, person, status);
    }

    void add_book_item(String book_item){

    }

    void block_member(String member){

    }

    void un_block_member(String member){

    }

}
