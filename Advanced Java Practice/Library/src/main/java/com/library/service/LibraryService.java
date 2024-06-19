package com.library.service;

import com.library.dto.ApiResponse;
import com.library.entities.Library;

public interface LibraryService {

	ApiResponse addLibrary(Library library);

}
