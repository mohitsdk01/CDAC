package com.library.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.custom_exceptions.ResourceNotFoundException;
import com.library.dto.ApiResponse;
import com.library.entities.Books;
import com.library.entities.Library;
import com.library.repository.BooksRepository;
import com.library.repository.LibraryRepository;

@Service
@Transactional
public class BooksServiceImpl implements BooksService{

	@Autowired
	BooksRepository booksRepo;
	
	@Autowired
	LibraryRepository libRepo;
	
	@Override
	public ApiResponse addBook(Books book) {
		String msg = "Book Addition Failed!";
		Library library = libRepo.findByName(book.getLibrary().getName());
		if(library != null) {
			book.setLibrary(library);
			booksRepo.save(book);
			msg = "Book Addition Successful!";
		}
		else {
			throw new ResourceNotFoundException("Invalid Book!");
		}
		return new ApiResponse(msg);
	}

	@Override
	public ApiResponse updateBook(Long bookId, Books book) {
		String msg = "Book Updation Failed!";
		Books book1 = booksRepo.findById(bookId).orElse(null);
		Library library = libRepo.findByName(book.getLibrary().getName());
		if(library != null && book1 != null) {
			book1.setLibrary(library);
			book1.setAuthor(book.getAuthor());
			book1.setPublishedDate(book.getPublishedDate());
			book1.setTitle(book.getTitle());
			booksRepo.save(book1);
			msg = "Book Updation Successful!";
		}
		else {
			throw new ResourceNotFoundException("Invalid Book ID!");
		}
		return new ApiResponse(msg);
	}

//	@Override
//	public List<Books> getAllBooksAfterDate(LocalDate date) {
//		Books books = booksRepo.findByPublishedDate(date);
//		List<Books> resBooks = new ArrayList<>();
//		if(!books.isEmpty()) {
//			for(Books book : books) {
//				if(book.getPublishedDate().isAfter(date)) {
//					resBooks.add(book);
//				}
//			}
//		}
//		else {
//			throw new ResourceNotFoundException("Invalid Date!");
//		}
//		return resBooks;
//	}

}
