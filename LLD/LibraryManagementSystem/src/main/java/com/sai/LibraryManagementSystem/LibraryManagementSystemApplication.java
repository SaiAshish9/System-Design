package com.sai.LibraryManagementSystem;

import com.sai.LibraryManagementSystem.enums.BookFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementSystemApplication {

	public static void main(String[] args) {
		System.out.println(BookFormat.JOURNAL.name());
		SpringApplication.run(LibraryManagementSystemApplication.class, args);
	}

}
