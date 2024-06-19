package com.library.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entities.Library;
import com.library.service.LibraryService;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

	@Autowired
	LibraryService libService;
	
	@PostMapping
	public ResponseEntity<?> addLibrary(@RequestBody Library library){
		LocalDate date = library.getEstablishedDate();
		library.setEstablishedDate(date);
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(libService.addLibrary(library));
	}
}
