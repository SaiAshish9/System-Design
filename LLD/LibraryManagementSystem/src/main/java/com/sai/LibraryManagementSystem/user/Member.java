package com.sai.LibraryManagementSystem.user;

import com.sai.LibraryManagementSystem.book.BookItem;
import com.sai.LibraryManagementSystem.constants.Constants;
import com.sai.LibraryManagementSystem.enums.AccountStatus;
import com.sai.LibraryManagementSystem.enums.BookStatus;
import com.sai.LibraryManagementSystem.enums.ReservationStatus;
import com.sai.LibraryManagementSystem.utils.book.BookLending;
import com.sai.LibraryManagementSystem.utils.book.BookReservation;
import com.sai.LibraryManagementSystem.utils.book.Fine;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Member extends Account {

    private Date date_of_membership = new Date();
    private int total_books_checkedOut = 0;

    Member(Long id, String password, String person) {
        super(id, password, person);
    }

    Member(Long id, String password, String person, AccountStatus status) {
        super(id, password, person, status);
    }

    public boolean checkoutBookItem(BookItem bookItem) {
        if (this.getTotalBooksCheckedOut() >= Constants.MAX_BOOKS_ISSUED_TO_A_USER) {
            System.out.println("The user has already checked-out maximum number of books");
            return false;
        }
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
        if (bookReservation != null && bookReservation.getMemberId() != this.getId()) {
            System.out.println("self book is reserved by another member");
            return false;
        } else if (bookReservation != null) {
            bookReservation.setStatus(ReservationStatus.COMPLETED);
        }
        if (!bookItem.checkout(this.getId())) {
            return false;
        }
        this.incrementTotalBooksCheckedOut();
        return true;
    }

    public boolean renewBookItem(BookItem bookItem) {
        checkForFine(bookItem.getBarcode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
        if (bookReservation != null && bookReservation.getMemberId() != this.getId()) {
            System.out.println("self book is reserved by another member");
            this.decrementTotalBooksCheckedout();
            bookItem.setStatus(BookStatus.RESERVED);
            bookReservation.sendBookAvailableNotification();
            return false;
        } else if (bookReservation != null) {
            bookReservation.setStatus(ReservationStatus.COMPLETED);
        }
        BookLending.lendBook(bookItem.getBarcode(), this.getId());
        bookItem.setDueDate(LocalDateTime.now().plusDays(Constants.MAX_LENDING_DAYS));
        return true;
    }

    public void checkForFine(String bookItemBarcode) {
        BookLending bookLending = BookLending.fetchLendingDetails(bookItemBarcode);
        LocalDateTime dueDate = bookLending.getDueDate();
        LocalDate today = LocalDate.now();
        if (today.isAfter(ChronoLocalDate.from(dueDate))) {
            Period diff = Period.between(LocalDate.from(dueDate), today);
            int diffDays = diff.getDays();
            Fine.collectFine(this.getId(), diffDays);
        }
    }

    public void returnBookItem(BookItem bookItem) {
        checkForFine(bookItem.getBarcode());
        BookReservation bookReservation = BookReservation.fetchReservationDetails(bookItem.getBarcode());
        if (bookReservation != null) {
            bookItem.setStatus(BookStatus.RESERVED);
            bookReservation.sendBookAvailableNotification();
            bookItem.setStatus(BookStatus.AVAILABLE);
        }
    }

    public void incrementTotalBooksCheckedOut() {
        total_books_checkedOut++;
    }

    public void decrementTotalBooksCheckedout() {
        total_books_checkedOut--;
    }

    public Date getDate_of_membership() {
        return date_of_membership;
    }

    public void setDate_of_membership(Date date_of_membership) {
        this.date_of_membership = date_of_membership;
    }

    public int getTotalBooksCheckedOut() {
        return total_books_checkedOut;
    }

    public void setTotalBooksCheckedOut(int total_books_checkedOut) {
        this.total_books_checkedOut = total_books_checkedOut;
    }
}
