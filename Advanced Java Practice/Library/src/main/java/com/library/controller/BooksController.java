package com.library.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entities.Books;
import com.library.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	@PostMapping
	public ResponseEntity<?> addBook(@RequestBody Books book){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(booksService.addBook(book));
	}
	
	@PatchMapping("/{bookId}")
	public ResponseEntity<?> updateBook
	(@PathVariable Long bookId, @RequestBody Books book){
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(booksService.updateBook(bookId, book));
	}
	
//	@GetMapping("/{date}")
//	public List<Books> getAllBooksAfterDate(@PathVariable LocalDate date){
//		return booksService.getAllBooksAfterDate(date);
//	}
}
