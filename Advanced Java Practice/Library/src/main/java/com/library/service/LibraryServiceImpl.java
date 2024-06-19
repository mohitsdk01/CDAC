package com.library.service;

import java.time.LocalDate;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.dto.ApiResponse;
import com.library.entities.Library;
import com.library.repository.LibraryRepository;

@Service
@Transactional
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	LibraryRepository libRepo;
	
	@Override
	public ApiResponse addLibrary(Library library) {
		String msg = "Library Add Failed!";
		if(library != null) {
			libRepo.save(library);
			msg = "Library Add Successful!";
		}
		return new ApiResponse(msg);
	}

}
