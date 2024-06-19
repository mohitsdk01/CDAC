package com.library.service;

import com.library.dto.ApiResponse;
import com.library.entities.Books;

public interface BooksService {

	ApiResponse addBook(Books book);

	ApiResponse updateBook(Long bookId, Books book);

//	List<Books> getAllBooksAfterDate(LocalDate date);

}
