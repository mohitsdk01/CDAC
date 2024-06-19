package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.Books;
import com.library.entities.Library;
import java.util.List;
import java.time.LocalDate;

public interface BooksRepository extends JpaRepository<Books, Long>{

//	Books findByPublishedDate(LocalDate publisheddate);
}
